package es.teldavega;

import es.teldavega.http.HttpConnection;
import es.teldavega.http.HttpMethods;
import es.teldavega.responses.GithubUserEvent;
import es.teldavega.responses.enums.EventType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Main {

    public static final String BASEURL = "https://api.github.com/users/";
    public static final String EVENTS = "/events";
    private static final Logger log = LogManager.getLogger(Main.class);
    private static final Logger alwaysVisibleLog = LogManager.getLogger("AlwaysVisibleLogger");
    public static final String GITHUB_TOKEN = "github.token";
    public static final String NO_GITHUB_TOKEN_PROVIDED = "No github token provided";

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            log.error("No arguments provided. Please provide a username.");
            return;
        }

        Properties properties = loadProperties();
        String logLevel = properties.getProperty("log.level", "info").toUpperCase();
        setLogLevel(logLevel);
        printInitApp(args);
        String baseUrl = composeUrl(args);
        if (log.isInfoEnabled()) {
            log.info("Getting events of {} ", args[0]);
        }
        HttpConnection<GithubUserEvent> httpConnection;
        try {
             httpConnection = getGithubUserEventHttpConnection(properties, baseUrl);
        } catch (Exception e) {
            return;
        }
        if (httpConnection.getResponseBody().length == 0) {
            log.warn("No events found for user {}", args[0]);
            return;
        }

        printResult(httpConnection);

        Map<EventType, Map<String, Integer>> eventTypesMap = filterUserEvents(httpConnection.getResponseBody());
        printUserEvents(eventTypesMap);

        try {
            httpConnection.closeConnection();
        } catch (IOException e) {
            log.error("Error closing connection", e);
        }
    }

    private static void printInitApp(String[] args) {
        if (log.isInfoEnabled()) {
            log.info("Starting application");
        }
        if (log.isDebugEnabled()) {
            log.debug(String.format("Arguments: %s", String.join(", ", args)));
        }
    }

    private static void printResult(HttpConnection<GithubUserEvent> httpConnection) throws IOException {
        if (log.isDebugEnabled()) {
            log.debug(httpConnection.getFullResponse());
        } else if (log.isInfoEnabled()) {
            log.info(httpConnection.getResponseWithoutBody());
        }
    }

    private static HttpConnection<GithubUserEvent> getGithubUserEventHttpConnection(Properties properties, String baseUrl) throws IOException {
        Map<String, String> headers = new HashMap<>();
        try {
            if (properties.getProperty(GITHUB_TOKEN) == null || properties.getProperty(GITHUB_TOKEN).isEmpty()) {
                log.error(NO_GITHUB_TOKEN_PROVIDED);
                throw new IOException(NO_GITHUB_TOKEN_PROVIDED);
            }
        } catch (NullPointerException e) {
            log.error(NO_GITHUB_TOKEN_PROVIDED);
            throw new IOException(NO_GITHUB_TOKEN_PROVIDED);
        }
        headers.put("Authorization", "Bearer " + properties.getProperty(GITHUB_TOKEN));

        HttpConnection<GithubUserEvent> httpConnection = new HttpConnection<>(baseUrl, HttpMethods.GET, null, headers);
        httpConnection.executeRequest(GithubUserEvent[].class, log);
        return httpConnection;
    }

    private static Properties loadProperties() throws IOException {
        String propertiesFile = System.getProperty("propertyFile");
        if (propertiesFile == null || propertiesFile.isEmpty()) {
            log.error("you must specify a properties file with -DpropertyFile=<path>");
            throw new IOException("No properties file specified");
        }

        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(propertiesFile)) {
            properties.load(fis);
        } catch (IOException e) {
            throw new IOException("Error loading property file " + propertiesFile, e);
        }
        return properties;
    }

    private static String composeUrl(String[] args) {
        String username = args[0];
        String composedUrl = BASEURL + username + EVENTS;
        if (log.isDebugEnabled()) {
            log.debug("Composed URL: {}", composedUrl);
        }
        return composedUrl;
    }

    private static void printUserEvents(Map<EventType, Map<String, Integer>> eventTypesMap) {
        alwaysVisibleLog.info("User events:");
        for (Map.Entry<EventType, Map<String, Integer>> entry : eventTypesMap.entrySet()) {
            EventType type = entry.getKey();
            Map<String, Integer> repoCounts = entry.getValue();
            String message = EventType.eventMessages.get(type);

            for (Map.Entry<String, Integer> repoEntry : repoCounts.entrySet()) {
                alwaysVisibleLog.info("{} {} {}", repoEntry.getValue(), message, repoEntry.getKey());
            }
        }
    }

    private static Map<EventType, Map<String, Integer>> filterUserEvents(GithubUserEvent[] responseBody) {
        Map<EventType, Map<String, Integer>> eventTypesMap = new EnumMap<>(EventType.class);
        if(log.isDebugEnabled()) {
            log.debug("Filtering user events");
        }

        for (EventType type : EventType.values()) {
            eventTypesMap.put(type, new HashMap<>());
        }

        for (GithubUserEvent event : responseBody) {
            Map<String, Integer> eventMap = eventTypesMap.get(event.getType());
            if (eventMap != null) {

                String repoName = event.getRepo().getName();
                if (log.isDebugEnabled()) {
                    log.debug("Adding event of type {} to repo: {}", event.getType(), repoName);
                }
                eventMap.put(repoName, eventMap.getOrDefault(repoName, 0) + 1);
            }
        }
        return eventTypesMap;
    }

    private static void setLogLevel(String logLevel) {
        try {
            Level level = Level.valueOf(logLevel);
            Configurator.setRootLevel(level);
            if (log.isDebugEnabled()) {
                log.debug("Log level set to {}", level);
            }
        } catch (IllegalArgumentException e) {
            log.error("Invalid log level: {}. Defaulting to INFO.", logLevel);
            Configurator.setRootLevel(Level.INFO);
        }
    }

}
package es.teldavega;

import es.teldavega.http.HttpConnection;
import es.teldavega.http.HttpMethods;
import es.teldavega.responses.GithubUserEvent;
import es.teldavega.responses.enums.EventType;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        String username = args[0];
        String baseUrl = "https://api.github.com/users/" + username + "/events";
        Map<String, String> headers = new HashMap<>();
        Properties properties = new Properties();
        properties.load(Main.class.getClassLoader().getResourceAsStream("application.properties"));
        headers.put("Authorization", "Bearer " + properties.getProperty("github.token"));
        HttpConnection<GithubUserEvent> httpConnection = new HttpConnection<>(baseUrl, HttpMethods.GET, null, headers);
        httpConnection.executeRequest();
        String responseWithoutHeader = httpConnection.getResponseWithoutHeader(GithubUserEvent[].class);
        System.out.println(responseWithoutHeader);

        GithubUserEvent[] responseBody = httpConnection.getResponseBody();
        printUserEvents(responseBody);

    }

    private static void printUserEvents(GithubUserEvent[] responseBody) {
        Map<EventType, Map<String, Integer>> eventTypesMap = new HashMap<>();

        for (EventType type : EventType.values()) {
            eventTypesMap.put(type, new HashMap<>());
        }

        for (GithubUserEvent event : responseBody) {
            Map<String, Integer> eventMap = eventTypesMap.get(event.getType());
            if (eventMap != null) {
                String repoName = event.getRepo().getName();
                eventMap.put(repoName, eventMap.getOrDefault(repoName, 0) + 1);
            }
        }



        System.out.println("User events:");
        for (Map.Entry<EventType, Map<String, Integer>> entry : eventTypesMap.entrySet()) {
            EventType type = entry.getKey();
            Map<String, Integer> repoCounts = entry.getValue();
            String message = EventType.eventMessages.get(type);

            for (Map.Entry<String, Integer> repoEntry : repoCounts.entrySet()) {
                System.out.println(repoEntry.getValue() + " " + message + " " + repoEntry.getKey());
            }
        }
    }


}
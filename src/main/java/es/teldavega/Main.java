package es.teldavega;

import es.teldavega.http.HttpConnection;
import es.teldavega.http.HttpMethods;

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
        HttpConnection httpConnection = new HttpConnection(baseUrl, HttpMethods.GET, null, headers);
        httpConnection.executeRequest();
        System.out.println(httpConnection.getResponseWithoutHeader());

    }


}
package es.teldavega.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HttpConnection <T>{
    public static final String RESPONSE_SEPARATOR_LINE = "-------------------------\n";
    private URL url;
    private HttpMethods method;
    private Map<String, String> params;
    private Map<String, String> headers;
    private HttpURLConnection connection;
    private int connectionTimeout;
    private int readTimeout;
    private final Gson gson;
    private T[] responseBody;

    public HttpConnection(String url, HttpMethods method, Map<String, String> params, Map<String, String> headers
            , int connectionTimeout, int readTimeout) throws MalformedURLException {
        this.url = new URL(url);
        this.method = method;
        this.params = params;
        this.headers = headers;
        this.connectionTimeout = connectionTimeout;
        this.readTimeout = readTimeout;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public HttpConnection(String url, HttpMethods method, Map<String, String> params, Map<String, String> headers) throws MalformedURLException {
        this(url, method, params, headers, 0, 0);
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public HttpMethods getMethod() {
        return method;
    }

    public void setMethod(HttpMethods method) {
        this.method = method;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public void executeRequest() throws IOException {
        this.connection = (HttpURLConnection) this.url.openConnection();
        this.connection.setRequestMethod(this.method.toString());
        addParams();
        addHeaders();
        addTimeouts();
    }

    private void addTimeouts() {
        if (this.connectionTimeout > 0) {
            this.connection.setConnectTimeout(this.connectionTimeout);
        }
        if (this.readTimeout > 0) {
            this.connection.setReadTimeout(this.readTimeout);
        }
    }

    private void addParams() throws IOException {
        if (this.params != null && !this.params.isEmpty()) {
            this.connection.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(this.connection.getOutputStream());
            out.writeBytes(ParametersStringBuilder.getParamsString(this.params));
            out.flush();
            out.close();
        }
    }

    private void addHeaders() {
        if (this.headers != null && !this.headers.isEmpty()) {
            this.headers.forEach(this.connection::setRequestProperty);
        }
    }

    public String getFullResponse(Type typeOfT) throws IOException {
        StringBuilder fullResponseBuilder = new StringBuilder();
        appendResponseCode(fullResponseBuilder);
        appendResponseHeaders(fullResponseBuilder);
        appendResponseBody(fullResponseBuilder, typeOfT);
        return fullResponseBuilder.toString();
    }

    private <T> void appendResponseBody(StringBuilder fullResponseBuilder, Type typeOfT) throws IOException {
        fullResponseBuilder.append(RESPONSE_SEPARATOR_LINE);
        fullResponseBuilder.append("RESPONSE BODY:\n");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(this.connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine).append("\n");
        }
        responseBody = gson.fromJson(content.toString(), typeOfT);
        fullResponseBuilder.append(Arrays.toString(responseBody));
        in.close();
    }

    private void appendResponseHeaders(StringBuilder fullResponseBuilder) {
        fullResponseBuilder.append(RESPONSE_SEPARATOR_LINE);
        fullResponseBuilder.append("RESPONSE HEADERS:\n");
        this.connection.getHeaderFields().entrySet().stream()
                .filter(entry -> entry.getKey() != null)
                .forEach(entry -> {
                    fullResponseBuilder.append(entry.getKey()).append(": ");
                    List headerValues = entry.getValue();
                    Iterator it = headerValues.iterator();
                    if (it.hasNext()) {
                        fullResponseBuilder.append(it.next());
                        while (it.hasNext()) {
                            fullResponseBuilder.append(", ").append(it.next());
                        }
                    }
                    fullResponseBuilder.append("\n");
                });
    }

    private void appendResponseCode(StringBuilder fullResponseBuilder) throws IOException {
        fullResponseBuilder.append(RESPONSE_SEPARATOR_LINE);
        fullResponseBuilder.append("RESPONSE CODE:");
        fullResponseBuilder.append(this.connection.getResponseCode())
                .append(" ")
                .append(this.connection.getResponseMessage())
                .append("\n");
    }

    public String getResponseWithoutHeader(Type typeOfT) throws IOException {
        StringBuilder response = new StringBuilder();
        appendResponseCode(response);
        appendResponseBody(response, typeOfT);
        return response.toString();
    }

    public T[] getResponseBody() {
        return responseBody;
    }


}

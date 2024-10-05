package es.teldavega.responses;

import es.teldavega.responses.users.StickySimpleUser;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class IssuePerformedViaGithubApp {
    private String clientID;
    private String clientSecret;
    private OffsetDateTime createdAt;
    private String description;
    private List<String> events;
    private String externalURL;
    private String htmlURL;
    private long id;
    private Long installationsCount;
    private String name;
    private String nodeID;
    private StickySimpleUser owner;
    private String pem;
    private Map<String, String> permissions;
    private String slug;
    private OffsetDateTime updatedAt;
    private String webhookSecret;
}

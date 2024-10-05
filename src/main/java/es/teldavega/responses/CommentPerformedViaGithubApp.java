package es.teldavega.responses;

import es.teldavega.responses.users.PurpleSimpleUser;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class CommentPerformedViaGithubApp {
    private String clientId;
    private String clientSecret;
    private OffsetDateTime createdAt;
    private String description;
    private List<String> events;
    private String externalUrl;
    private String htmlUrl;
    private long id;
    private Long installationCount;
    private String name;
    private String nodeId;
    private PurpleSimpleUser owner;
    private String pem;
    private Map<String,String> permissions;
    private String slug;
    private OffsetDateTime updatedAt;
    private String webhookSecret;
}

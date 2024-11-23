package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class CommentPerformedViaGithubApp {
    @SerializedName("client_id")
    private String clientID;
    @SerializedName("client_secret")
    private String clientSecret;
    @SerializedName("created_at")
    private Date createdAt;
    private String description;
    private List<String> events;
    @SerializedName("external_url")
    private String externalURL;
    @SerializedName("html_url")
    private String htmlURL;
    private long id;
    @SerializedName("installations_count")
    private Long installationsCount;
    private String name;
    @SerializedName("node_id")
    private String nodeID;
    private PurpleSimpleUser owner;
    private String pem;
    private Map<String, String> permissions;
    private String slug;
    @SerializedName("updated_at")
    private Date updatedAt;
    @SerializedName("webhook_secret")
    private String webhookSecret;

    public String getClientID() { return clientID; }
    public void setClientID(String value) { this.clientID = value; }

    public String getClientSecret() { return clientSecret; }
    public void setClientSecret(String value) { this.clientSecret = value; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date value) { this.createdAt = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    /**
     * The list of events for the GitHub app
     */
    public List<String> getEvents() { return events; }
    public void setEvents(List<String> value) { this.events = value; }

    public String getExternalURL() { return externalURL; }
    public void setExternalURL(String value) { this.externalURL = value; }

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    /**
     * Unique identifier of the GitHub app
     */
    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    /**
     * The number of installations associated with the GitHub app
     */
    public Long getInstallationsCount() { return installationsCount; }
    public void setInstallationsCount(Long value) { this.installationsCount = value; }

    /**
     * The name of the GitHub app
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getNodeID() { return nodeID; }
    public void setNodeID(String value) { this.nodeID = value; }

    public PurpleSimpleUser getOwner() { return owner; }
    public void setOwner(PurpleSimpleUser value) { this.owner = value; }

    public String getPem() { return pem; }
    public void setPem(String value) { this.pem = value; }

    /**
     * The set of permissions for the GitHub app
     */
    public Map<String, String> getPermissions() { return permissions; }
    public void setPermissions(Map<String, String> value) { this.permissions = value; }

    /**
     * The slug name of the GitHub app
     */
    public String getSlug() { return slug; }
    public void setSlug(String value) { this.slug = value; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date value) { this.updatedAt = value; }

    public String getWebhookSecret() { return webhookSecret; }
    public void setWebhookSecret(String value) { this.webhookSecret = value; }
}

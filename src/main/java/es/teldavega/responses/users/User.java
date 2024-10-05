package es.teldavega.responses.users;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("avatar_url")
    private String avatarURL;

    @SerializedName("email")
    private String email;

    @SerializedName("events_url")
    private String eventsURL;

    @SerializedName("followers_url")
    private String followersURL;

    @SerializedName("following_url")
    private String followingURL;

    @SerializedName("gists_url")
    private String gistsURL;

    @SerializedName("gravatar_id")
    private String gravatarID;

    @SerializedName("html_url")
    private String htmlURL;

    @SerializedName("id")
    private long id;

    @SerializedName("login")
    private String login;

    @SerializedName("name")
    private String name;

    @SerializedName("node_id")
    private String nodeID;

    @SerializedName("organizations_url")
    private String organizationsURL;

    @SerializedName("received_events_url")
    private String receivedEventsURL;

    @SerializedName("repos_url")
    private String reposURL;

    @SerializedName("site_admin")
    private boolean siteAdmin;

    @SerializedName("starred_at")
    private String starredAt;

    @SerializedName("starred_url")
    private String starredURL;

    @SerializedName("subscriptions_url")
    private String subscriptionsURL;

    @SerializedName("type")
    private String type;

    @SerializedName("url")
    private String url;

    public User() {
        // Empty constructor
    }

    public String getAvatarURL() {
        return avatarURL;
    }
    public String getEmail() {
        return email;
    }
    public String getEventsURL() {
        return eventsURL;
    }
    public String getFollowersURL() {
        return followersURL;
    }
    public String getFollowingURL() {
        return followingURL;
    }
    public String getGistsURL() {
        return gistsURL;
    }
    public String getGravatarID() {
        return gravatarID;
    }
    public String getHtmlURL() {
        return htmlURL;
    }
    public long getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getName() {
        return name;
    }
    public String getNodeID() {
        return nodeID;
    }
    public String getOrganizationsURL() {
        return organizationsURL;
    }
    public String getReceivedEventsURL() {
        return receivedEventsURL;
    }
    public String getReposURL() {
        return reposURL;
    }
    public boolean isSiteAdmin() {
        return siteAdmin;
    }
    public String getStarredAt() {
        return starredAt;
    }
    public String getStarredURL() {
        return starredURL;
    }
    public String getSubscriptionsURL() {
        return subscriptionsURL;
    }
    public String getType() {
        return type;
    }
    public String getUrl() {
        return url;
    }

}

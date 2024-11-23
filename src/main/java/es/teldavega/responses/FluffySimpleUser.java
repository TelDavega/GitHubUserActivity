package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

/**
 * A GitHub user.
 */
public class FluffySimpleUser {
    @SerializedName("avatar_url")
    private String avatarURL;
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
    private long id;
    private String login;
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
    private String type;
    private String url;
    @SerializedName("user_view_type")
    private String userViewType;

    public String getAvatarURL() { return avatarURL; }
    public void setAvatarURL(String value) { this.avatarURL = value; }

    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    public String getEventsURL() { return eventsURL; }
    public void setEventsURL(String value) { this.eventsURL = value; }

    public String getFollowersURL() { return followersURL; }
    public void setFollowersURL(String value) { this.followersURL = value; }

    public String getFollowingURL() { return followingURL; }
    public void setFollowingURL(String value) { this.followingURL = value; }

    public String getGistsURL() { return gistsURL; }
    public void setGistsURL(String value) { this.gistsURL = value; }

    public String getGravatarID() { return gravatarID; }
    public void setGravatarID(String value) { this.gravatarID = value; }

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getLogin() { return login; }
    public void setLogin(String value) { this.login = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getNodeID() { return nodeID; }
    public void setNodeID(String value) { this.nodeID = value; }

    public String getOrganizationsURL() { return organizationsURL; }
    public void setOrganizationsURL(String value) { this.organizationsURL = value; }

    public String getReceivedEventsURL() { return receivedEventsURL; }
    public void setReceivedEventsURL(String value) { this.receivedEventsURL = value; }

    public String getReposURL() { return reposURL; }
    public void setReposURL(String value) { this.reposURL = value; }

    public boolean getSiteAdmin() { return siteAdmin; }
    public void setSiteAdmin(boolean value) { this.siteAdmin = value; }

    public String getStarredAt() { return starredAt; }
    public void setStarredAt(String value) { this.starredAt = value; }

    public String getStarredURL() { return starredURL; }
    public void setStarredURL(String value) { this.starredURL = value; }

    public String getSubscriptionsURL() { return subscriptionsURL; }
    public void setSubscriptionsURL(String value) { this.subscriptionsURL = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public String getUserViewType() { return userViewType; }
    public void setUserViewType(String value) { this.userViewType = value; }
}

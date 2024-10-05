package es.teldavega.responses.actors;

import com.google.gson.annotations.SerializedName;

public class Actor {

    @SerializedName("avatar_url")
    private String avatarUrl;

    @SerializedName("display_login")
    private String displayLogin;

    @SerializedName("gravatar_id")
    private String gravatarId;

    @SerializedName("id")
    private long id;

    @SerializedName("login")
    private String login;

    @SerializedName("url")
    private String url;

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public String getDisplayLogin() {
        return displayLogin;
    }
    public String getGravatarId() {
        return gravatarId;
    }
    public long getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getUrl() {
        return url;
    }
}

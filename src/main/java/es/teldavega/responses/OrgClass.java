package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Actor
 */
public class OrgClass {
    @SerializedName("avatar_url")
    private String avatarURL;
    @SerializedName("display_login")
    private String displayLogin;
    @SerializedName("gravatar_id")
    private String gravatarID;
    private long id;
    private String login;
    private String url;

    public String getAvatarURL() { return avatarURL; }
    public void setAvatarURL(String value) { this.avatarURL = value; }

    public String getDisplayLogin() { return displayLogin; }
    public void setDisplayLogin(String value) { this.displayLogin = value; }

    public String getGravatarID() { return gravatarID; }
    public void setGravatarID(String value) { this.gravatarID = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getLogin() { return login; }
    public void setLogin(String value) { this.login = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}

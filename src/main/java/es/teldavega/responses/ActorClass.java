package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Actor
 */
public class ActorClass {
    private long id;
    private String login;
    @SerializedName("display_login")
    private String displayLogin;
    @SerializedName("gravatar_id")
    private String gravatarID;
    private String url;
    @SerializedName("avatar_url")
    private String avatarURL;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ActorClass{");
        sb.append("id=").append(id);
        sb.append(", login='").append(login).append('\'');
        sb.append(", displayLogin='").append(displayLogin).append('\'');
        sb.append(", gravatarID='").append(gravatarID).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", avatarURL='").append(avatarURL).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package es.teldavega.responses.reactions;

import com.google.gson.annotations.SerializedName;

public class Reaction {
    @SerializedName("+1")
    private long the1;
    @SerializedName("-1")
    private long reactionRollup1;
    @SerializedName("confused")
    private long confused;
    @SerializedName("eyes")
    private long eyes;
    @SerializedName("heart")
    private long heart;
    @SerializedName("hooray")
    private long hooray;
    @SerializedName("laugh")
    private long laugh;
    @SerializedName("rocket")
    private long rocket;
    @SerializedName("total_count")
    private long totalCount;
    @SerializedName("url")
    private String url;

    public long getThe1() {
        return the1;
    }
    public long getReactionRollup1() {
        return reactionRollup1;
    }
    public long getConfused() {
        return confused;
    }
    public long getEyes() {
        return eyes;
    }
    public long getHeart() {
        return heart;
    }
    public long getHooray() {
        return hooray;
    }
    public long getLaugh() {
        return laugh;
    }
    public long getRocket() {
        return rocket;
    }
    public long getTotalCount() {
        return totalCount;
    }
    public String getUrl() {
        return url;
    }
}

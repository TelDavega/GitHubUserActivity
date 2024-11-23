package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Date;


public class PullRequest {
    @SerializedName("diff_url")
    private String diffURL;
    @SerializedName("html_url")
    private String htmlURL;
    @SerializedName("merged_at")
    private Date mergedAt;
    @SerializedName("patch_url")
    private String patchURL;
    private String url;

    public String getDiffURL() { return diffURL; }
    public void setDiffURL(String value) { this.diffURL = value; }

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    public Date getMergedAt() { return mergedAt; }
    public void setMergedAt(Date value) { this.mergedAt = value; }

    public String getPatchURL() { return patchURL; }
    public void setPatchURL(String value) { this.patchURL = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}

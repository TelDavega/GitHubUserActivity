package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

public class Page {
    private String action;
    @SerializedName("html_url")
    private String htmlURL;
    @SerializedName("page_name")
    private String pageName;
    private String sha;
    private String summary;
    private String title;

    public String getAction() { return action; }
    public void setAction(String value) { this.action = value; }

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    public String getPageName() { return pageName; }
    public void setPageName(String value) { this.pageName = value; }

    public String getSHA() { return sha; }
    public void setSHA(String value) { this.sha = value; }

    public String getSummary() { return summary; }
    public void setSummary(String value) { this.summary = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }
}

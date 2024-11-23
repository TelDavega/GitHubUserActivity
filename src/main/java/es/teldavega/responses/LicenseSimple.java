package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

/**
 * License Simple
 */
public class LicenseSimple {
    @SerializedName("html_url")
    private String htmlURL;
    private String key;
    private String name;
    @SerializedName("node_id")
    private String nodeID;
    @SerializedName("spdx_id")
    private String spdxID;
    private String url;

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getNodeID() { return nodeID; }
    public void setNodeID(String value) { this.nodeID = value; }

    public String getSpdxID() { return spdxID; }
    public void setSpdxID(String value) { this.spdxID = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}

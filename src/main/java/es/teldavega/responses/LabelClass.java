package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

public class LabelClass {
    private String color;
    @SerializedName("default")
    private Boolean labelDefault;
    private String description;
    private Long id;
    private String name;
    @SerializedName("node_id")
    private String nodeID;
    private String url;

    public String getColor() { return color; }
    public void setColor(String value) { this.color = value; }

    public Boolean getLabelDefault() { return labelDefault; }
    public void setLabelDefault(Boolean value) { this.labelDefault = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public Long getID() { return id; }
    public void setID(Long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getNodeID() { return nodeID; }
    public void setNodeID(String value) { this.nodeID = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}

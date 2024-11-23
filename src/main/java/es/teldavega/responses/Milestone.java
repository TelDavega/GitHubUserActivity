package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;
import es.teldavega.responses.enums.State;

import java.util.Date;


/**
 * A collection of related issues and pull requests.
 */
public class Milestone {
    @SerializedName("closed_at")
    private Date closedAt;
    @SerializedName("closed_issues")
    private long closedIssues;
    @SerializedName("created_at")
    private Date createdAt;
    private MilestoneSimpleUser creator;
    private String description;
    @SerializedName("due_on")
    private Date dueOn;
    @SerializedName("html_url")
    private String htmlURL;
    private long id;
    @SerializedName("labels_url")
    private String labelsURL;
    @SerializedName("node_id")
    private String nodeID;
    private long number;
    @SerializedName("open_issues")
    private long openIssues;
    private State state;
    private String title;
    @SerializedName("updated_at")
    private Date updatedAt;
    private String url;

    public Date getClosedAt() { return closedAt; }
    public void setClosedAt(Date value) { this.closedAt = value; }

    public long getClosedIssues() { return closedIssues; }
    public void setClosedIssues(long value) { this.closedIssues = value; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date value) { this.createdAt = value; }

    public MilestoneSimpleUser getCreator() { return creator; }
    public void setCreator(MilestoneSimpleUser value) { this.creator = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public Date getDueOn() { return dueOn; }
    public void setDueOn(Date value) { this.dueOn = value; }

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getLabelsURL() { return labelsURL; }
    public void setLabelsURL(String value) { this.labelsURL = value; }

    public String getNodeID() { return nodeID; }
    public void setNodeID(String value) { this.nodeID = value; }

    /**
     * The number of the milestone.
     */
    public long getNumber() { return number; }
    public void setNumber(long value) { this.number = value; }

    public long getOpenIssues() { return openIssues; }
    public void setOpenIssues(long value) { this.openIssues = value; }

    /**
     * The state of the milestone.
     */
    public State getState() { return state; }
    public void setState(State value) { this.state = value; }

    /**
     * The title of the milestone.
     */
    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date value) { this.updatedAt = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}

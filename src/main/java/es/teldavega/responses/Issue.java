package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;
import es.teldavega.responses.enums.AuthorAssociation;
import es.teldavega.responses.enums.StateReason;

import java.util.Date;
import java.util.List;

/**
 * Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 */
public class Issue {
    @SerializedName("active_lock_reason")
    private String activeLockReason;
    private FluffySimpleUser assignee;
    private List<AssigneeElement> assignees;
    @SerializedName("author_association")
    private AuthorAssociation authorAssociation;
    private String body;
    @SerializedName("body_html")
    private String bodyHTML;
    @SerializedName("body_text")
    private String bodyText;
    @SerializedName("closed_at")
    private Date closedAt;
    @SerializedName("closed_by")
    private TentacledSimpleUser closedBy;
    private long comments;
    @SerializedName("comments_url")
    private String commentsURL;
    @SerializedName("created_at")
    private Date createdAt;
    private Boolean draft;
    @SerializedName("events_url")
    private String eventsURL;
    @SerializedName("html_url")
    private String htmlURL;
    private long id;
    private List<LabelElement> labels;
    @SerializedName("labels_url")
    private String labelsURL;
    private boolean locked;
    private Milestone milestone;
    @SerializedName("node_id")
    private String nodeID;
    private long number;
    @SerializedName("performed_via_github_app")
    private IssuePerformedViaGithubApp performedViaGithubApp;
    @SerializedName("pull_request")
    private PullRequest pullRequest;
    private IssueReactions reactions;
    private Repository repository;
    @SerializedName("repository_url")
    private String repositoryURL;
    private String state;
    @SerializedName("state_reason")
    private StateReason stateReason;
    @SerializedName("timeline_url")
    private String timelineURL;
    private String title;
    @SerializedName("updated_at")
    private Date updatedAt;
    private String url;
    private IndigoSimpleUser user;

    public String getActiveLockReason() { return activeLockReason; }
    public void setActiveLockReason(String value) { this.activeLockReason = value; }

    public FluffySimpleUser getAssignee() { return assignee; }
    public void setAssignee(FluffySimpleUser value) { this.assignee = value; }

    public List<AssigneeElement> getAssignees() { return assignees; }
    public void setAssignees(List<AssigneeElement> value) { this.assignees = value; }

    /**
     * How the author is associated with the repository.
     */
    public AuthorAssociation getAuthorAssociation() { return authorAssociation; }
    public void setAuthorAssociation(AuthorAssociation value) { this.authorAssociation = value; }

    /**
     * Contents of the issue
     */
    public String getBody() { return body; }
    public void setBody(String value) { this.body = value; }

    public String getBodyHTML() { return bodyHTML; }
    public void setBodyHTML(String value) { this.bodyHTML = value; }

    public String getBodyText() { return bodyText; }
    public void setBodyText(String value) { this.bodyText = value; }

    public Date getClosedAt() { return closedAt; }
    public void setClosedAt(Date value) { this.closedAt = value; }

    public TentacledSimpleUser getClosedBy() { return closedBy; }
    public void setClosedBy(TentacledSimpleUser value) { this.closedBy = value; }

    public long getComments() { return comments; }
    public void setComments(long value) { this.comments = value; }

    public String getCommentsURL() { return commentsURL; }
    public void setCommentsURL(String value) { this.commentsURL = value; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date value) { this.createdAt = value; }

    public Boolean getDraft() { return draft; }
    public void setDraft(Boolean value) { this.draft = value; }

    public String getEventsURL() { return eventsURL; }
    public void setEventsURL(String value) { this.eventsURL = value; }

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    /**
     * Labels to associate with this issue; pass one or more label names to replace the set of
     * labels on this issue; send an empty array to clear all labels from the issue; note that
     * the labels are silently dropped for users without push access to the repository
     */
    public List<LabelElement> getLabels() { return labels; }
    public void setLabels(List<LabelElement> value) { this.labels = value; }

    public String getLabelsURL() { return labelsURL; }
    public void setLabelsURL(String value) { this.labelsURL = value; }

    public boolean getLocked() { return locked; }
    public void setLocked(boolean value) { this.locked = value; }

    public Milestone getMilestone() { return milestone; }
    public void setMilestone(Milestone value) { this.milestone = value; }

    public String getNodeID() { return nodeID; }
    public void setNodeID(String value) { this.nodeID = value; }

    /**
     * Number uniquely identifying the issue within its repository
     */
    public long getNumber() { return number; }
    public void setNumber(long value) { this.number = value; }

    public IssuePerformedViaGithubApp getPerformedViaGithubApp() { return performedViaGithubApp; }
    public void setPerformedViaGithubApp(IssuePerformedViaGithubApp value) { this.performedViaGithubApp = value; }

    public PullRequest getPullRequest() { return pullRequest; }
    public void setPullRequest(PullRequest value) { this.pullRequest = value; }

    public IssueReactions getReactions() { return reactions; }
    public void setReactions(IssueReactions value) { this.reactions = value; }

    /**
     * A repository on GitHub.
     */
    public Repository getRepository() { return repository; }
    public void setRepository(Repository value) { this.repository = value; }

    public String getRepositoryURL() { return repositoryURL; }
    public void setRepositoryURL(String value) { this.repositoryURL = value; }

    /**
     * State of the issue; either 'open' or 'closed'
     */
    public String getState() { return state; }
    public void setState(String value) { this.state = value; }

    /**
     * The reason for the current state
     */
    public StateReason getStateReason() { return stateReason; }
    public void setStateReason(StateReason value) { this.stateReason = value; }

    public String getTimelineURL() { return timelineURL; }
    public void setTimelineURL(String value) { this.timelineURL = value; }

    /**
     * Title of the issue
     */
    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date value) { this.updatedAt = value; }

    /**
     * URL for the issue
     */
    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public IndigoSimpleUser getUser() { return user; }
    public void setUser(IndigoSimpleUser value) { this.user = value; }
}

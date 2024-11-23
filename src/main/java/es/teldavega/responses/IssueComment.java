package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;
import es.teldavega.responses.enums.AuthorAssociation;

import java.util.Date;

/**
 * Comments provide a way for people to collaborate on an issue.
 */
public class IssueComment {
    @SerializedName("author_association")
    private AuthorAssociation authorAssociation;
    private String body;
    @SerializedName("body_html")
    private String bodyHTML;
    @SerializedName("body_text")
    private String bodyText;
    @SerializedName("created_at")
    private Date createdAt;
    @SerializedName("html_url")
    private String htmlURL;
    private long id;
    @SerializedName("issue_url")
    private String issueURL;
    @SerializedName("node_id")
    private String nodeID;
    @SerializedName("performed_via_github_app")
    private CommentPerformedViaGithubApp performedViaGithubApp;
    private CommentReactions reactions;
    @SerializedName("updated_at")
    private Date updatedAt;
    private String url;
    private CommentSimpleUser user;

    /**
     * How the author is associated with the repository.
     */
    public AuthorAssociation getAuthorAssociation() { return authorAssociation; }
    public void setAuthorAssociation(AuthorAssociation value) { this.authorAssociation = value; }

    /**
     * Contents of the issue comment
     */
    public String getBody() { return body; }
    public void setBody(String value) { this.body = value; }

    public String getBodyHTML() { return bodyHTML; }
    public void setBodyHTML(String value) { this.bodyHTML = value; }

    public String getBodyText() { return bodyText; }
    public void setBodyText(String value) { this.bodyText = value; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date value) { this.createdAt = value; }

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    /**
     * Unique identifier of the issue comment
     */
    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getIssueURL() { return issueURL; }
    public void setIssueURL(String value) { this.issueURL = value; }

    public String getNodeID() { return nodeID; }
    public void setNodeID(String value) { this.nodeID = value; }

    public CommentPerformedViaGithubApp getPerformedViaGithubApp() { return performedViaGithubApp; }
    public void setPerformedViaGithubApp(CommentPerformedViaGithubApp value) { this.performedViaGithubApp = value; }

    public CommentReactions getReactions() { return reactions; }
    public void setReactions(CommentReactions value) { this.reactions = value; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date value) { this.updatedAt = value; }

    /**
     * URL for the issue comment
     */
    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public CommentSimpleUser getUser() { return user; }
    public void setUser(CommentSimpleUser value) { this.user = value; }
}

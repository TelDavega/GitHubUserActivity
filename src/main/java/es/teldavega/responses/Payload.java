package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Payload {

    @SerializedName("repository_id")
    private int repositoryId;
    @SerializedName("push_id")
    private long pushId;
    private int size;
    @SerializedName("distinct_size")
    private int distinctSize;
    private String ref;
    private String head;
    private String before;
    private List<Commit> commits;

    public int getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(int repositoryId) {
        this.repositoryId = repositoryId;
    }

    public long getPushId() {
        return pushId;
    }

    public void setPushId(long pushId) {
        this.pushId = pushId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDistinctSize() {
        return distinctSize;
    }

    public void setDistinctSize(int distinctSize) {
        this.distinctSize = distinctSize;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    private String action;
    private IssueComment comment;
    private Issue issue;
    private List<Page> pages;

    public String getAction() { return action; }
    public void setAction(String value) { this.action = value; }

    /**
     * Comments provide a way for people to collaborate on an issue.
     */
    public IssueComment getComment() { return comment; }
    public void setComment(IssueComment value) { this.comment = value; }

    /**
     * Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
     */
    public Issue getIssue() { return issue; }
    public void setIssue(Issue value) { this.issue = value; }

    public List<Page> getPages() { return pages; }
    public void setPages(List<Page> value) { this.pages = value; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Payload{");
        sb.append("repositoryId=").append(repositoryId);
        sb.append(", pushId=").append(pushId);
        sb.append(", size=").append(size);
        sb.append(", distinctSize=").append(distinctSize);
        sb.append(", ref='").append(ref).append('\'');
        sb.append(", head='").append(head).append('\'');
        sb.append(", before='").append(before).append('\'');
        sb.append(", commits=").append(commits);
        sb.append(", action='").append(action).append('\'');
        sb.append(", comment=").append(comment);
        sb.append(", issue=").append(issue);
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}

package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;
import es.teldavega.responses.enums.MergeCommitMessage;
import es.teldavega.responses.enums.MergeCommitTitle;
import es.teldavega.responses.enums.SquashMergeCommitMessage;
import es.teldavega.responses.enums.SquashMergeCommitTitle;

import java.util.Date;
import java.util.List;

/**
 * A repository on GitHub.
 */
public class Repository {
    @SerializedName("allow_auto_merge")
    private Boolean allowAutoMerge;
    @SerializedName("allow_forking")
    private Boolean allowForking;
    @SerializedName("allow_merge_commit")
    private Boolean allowMergeCommit;
    @SerializedName("allow_rebase_merge")
    private Boolean allowRebaseMerge;
    @SerializedName("allow_squash_merge")
    private Boolean allowSquashMerge;
    @SerializedName("allow_update_branch")
    private Boolean allowUpdateBranch;
    @SerializedName("anonymous_access_enabled")
    private Boolean anonymousAccessEnabled;
    @SerializedName("archive_url")
    private String archiveURL;
    private boolean archived;
    @SerializedName("assignees_url")
    private String assigneesURL;
    @SerializedName("blobs_url")
    private String blobsURL;
    @SerializedName("branches_url")
    private String branchesURL;
    @SerializedName("clone_url")
    private String cloneURL;
    @SerializedName("collaborators_url")
    private String collaboratorsURL;
    @SerializedName("comments_url")
    private String commentsURL;
    @SerializedName("commits_url")
    private String commitsURL;
    @SerializedName("compare_url")
    private String compareURL;
    @SerializedName("contents_url")
    private String contentsURL;
    @SerializedName("contributors_url")
    private String contributorsURL;
    @SerializedName("created_at")
    private Date createdAt;
    @SerializedName("default_branch")
    private String defaultBranch;
    @SerializedName("delete_branch_on_merge")
    private Boolean deleteBranchOnMerge;
    @SerializedName("deployments_url")
    private String deploymentsURL;
    private String description;
    private boolean disabled;
    @SerializedName("downloads_url")
    private String downloadsURL;
    @SerializedName("events_url")
    private String eventsURL;
    private boolean fork;
    private long forks;
    @SerializedName("forks_count")
    private long forksCount;
    @SerializedName("forks_url")
    private String forksURL;
    @SerializedName("full_name")
    private String fullName;
    @SerializedName("git_commits_url")
    private String gitCommitsURL;
    @SerializedName("git_refs_url")
    private String gitRefsURL;
    @SerializedName("git_tags_url")
    private String gitTagsURL;
    @SerializedName("git_url")
    private String gitURL;
    @SerializedName("has_discussions")
    private Boolean hasDiscussions;
    @SerializedName("has_downloads")
    private boolean hasDownloads;
    @SerializedName("has_issues")
    private boolean hasIssues;
    @SerializedName("has_pages")
    private boolean hasPages;
    @SerializedName("has_projects")
    private boolean hasProjects;
    @SerializedName("has_wiki")
    private boolean hasWiki;
    private String homepage;
    @SerializedName("hooks_url")
    private String hooksURL;
    @SerializedName("html_url")
    private String htmlURL;
    private long id;
    @SerializedName("is_template")
    private Boolean isTemplate;
    @SerializedName("issue_comment_url")
    private String issueCommentURL;
    @SerializedName("issue_events_url")
    private String issueEventsURL;
    @SerializedName("issues_url")
    private String issuesURL;
    @SerializedName("keys_url")
    private String keysURL;
    @SerializedName("labels_url")
    private String labelsURL;
    private String language;
    @SerializedName("languages_url")
    private String languagesURL;
    private LicenseSimple license;
    @SerializedName("master_branch")
    private String masterBranch;
    @SerializedName("merge_commit_message")
    private MergeCommitMessage mergeCommitMessage;
    @SerializedName("merge_commit_title")
    private MergeCommitTitle mergeCommitTitle;
    @SerializedName("merges_url")
    private String mergesURL;
    @SerializedName("milestones_url")
    private String milestonesURL;
    @SerializedName("mirror_url")
    private String mirrorURL;
    private String name;
    @SerializedName("node_id")
    private String nodeID;
    @SerializedName("notifications_url")
    private String notificationsURL;
    @SerializedName("open_issues")
    private long openIssues;
    @SerializedName("open_issues_count")
    private long openIssuesCount;
    private OwnerClass owner;
    private Permissions permissions;
    @SerializedName("private")
    private boolean repositoryPrivate;
    @SerializedName("pulls_url")
    private String pullsURL;
    @SerializedName("pushed_at")
    private Date pushedAt;
    @SerializedName("releases_url")
    private String releasesURL;
    private long size;
    @SerializedName("squash_merge_commit_message")
    private SquashMergeCommitMessage squashMergeCommitMessage;
    @SerializedName("squash_merge_commit_title")
    private SquashMergeCommitTitle squashMergeCommitTitle;
    @SerializedName("ssh_url")
    private String sshURL;
    @SerializedName("stargazers_count")
    private long stargazersCount;
    @SerializedName("stargazers_url")
    private String stargazersURL;
    @SerializedName("starred_at")
    private String starredAt;
    @SerializedName("statuses_url")
    private String statusesURL;
    @SerializedName("subscribers_url")
    private String subscribersURL;
    @SerializedName("subscription_url")
    private String subscriptionURL;
    @SerializedName("svn_url")
    private String svnURL;
    @SerializedName("tags_url")
    private String tagsURL;
    @SerializedName("teams_url")
    private String teamsURL;
    @SerializedName("temp_clone_token")
    private String tempCloneToken;
    private List<String> topics;
    @SerializedName("trees_url")
    private String treesURL;
    @SerializedName("updated_at")
    private Date updatedAt;
    private String url;
    @SerializedName("use_squash_PR_title_as_default")
    private Boolean useSquashPRTitleAsDefault;
    private String visibility;
    private long watchers;
    @SerializedName("watchers_count")
    private long watchersCount;
    @SerializedName("web_commit_signoff_required")
    private Boolean webCommitSignoffRequired;

    /**
     * Whether to allow Auto-merge to be used on pull requests.
     */
    public Boolean getAllowAutoMerge() { return allowAutoMerge; }
    public void setAllowAutoMerge(Boolean value) { this.allowAutoMerge = value; }

    /**
     * Whether to allow forking this repo
     */
    public Boolean getAllowForking() { return allowForking; }
    public void setAllowForking(Boolean value) { this.allowForking = value; }

    /**
     * Whether to allow merge commits for pull requests.
     */
    public Boolean getAllowMergeCommit() { return allowMergeCommit; }
    public void setAllowMergeCommit(Boolean value) { this.allowMergeCommit = value; }

    /**
     * Whether to allow rebase merges for pull requests.
     */
    public Boolean getAllowRebaseMerge() { return allowRebaseMerge; }
    public void setAllowRebaseMerge(Boolean value) { this.allowRebaseMerge = value; }

    /**
     * Whether to allow squash merges for pull requests.
     */
    public Boolean getAllowSquashMerge() { return allowSquashMerge; }
    public void setAllowSquashMerge(Boolean value) { this.allowSquashMerge = value; }

    /**
     * Whether or not a pull request head branch that is behind its base branch can always be
     * updated even if it is not required to be up to date before merging.
     */
    public Boolean getAllowUpdateBranch() { return allowUpdateBranch; }
    public void setAllowUpdateBranch(Boolean value) { this.allowUpdateBranch = value; }

    /**
     * Whether anonymous git access is enabled for this repository
     */
    public Boolean getAnonymousAccessEnabled() { return anonymousAccessEnabled; }
    public void setAnonymousAccessEnabled(Boolean value) { this.anonymousAccessEnabled = value; }

    public String getArchiveURL() { return archiveURL; }
    public void setArchiveURL(String value) { this.archiveURL = value; }

    /**
     * Whether the repository is archived.
     */
    public boolean getArchived() { return archived; }
    public void setArchived(boolean value) { this.archived = value; }

    public String getAssigneesURL() { return assigneesURL; }
    public void setAssigneesURL(String value) { this.assigneesURL = value; }

    public String getBlobsURL() { return blobsURL; }
    public void setBlobsURL(String value) { this.blobsURL = value; }

    public String getBranchesURL() { return branchesURL; }
    public void setBranchesURL(String value) { this.branchesURL = value; }

    public String getCloneURL() { return cloneURL; }
    public void setCloneURL(String value) { this.cloneURL = value; }

    public String getCollaboratorsURL() { return collaboratorsURL; }
    public void setCollaboratorsURL(String value) { this.collaboratorsURL = value; }

    public String getCommentsURL() { return commentsURL; }
    public void setCommentsURL(String value) { this.commentsURL = value; }

    public String getCommitsURL() { return commitsURL; }
    public void setCommitsURL(String value) { this.commitsURL = value; }

    public String getCompareURL() { return compareURL; }
    public void setCompareURL(String value) { this.compareURL = value; }

    public String getContentsURL() { return contentsURL; }
    public void setContentsURL(String value) { this.contentsURL = value; }

    public String getContributorsURL() { return contributorsURL; }
    public void setContributorsURL(String value) { this.contributorsURL = value; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date value) { this.createdAt = value; }

    /**
     * The default branch of the repository.
     */
    public String getDefaultBranch() { return defaultBranch; }
    public void setDefaultBranch(String value) { this.defaultBranch = value; }

    /**
     * Whether to delete head branches when pull requests are merged
     */
    public Boolean getDeleteBranchOnMerge() { return deleteBranchOnMerge; }
    public void setDeleteBranchOnMerge(Boolean value) { this.deleteBranchOnMerge = value; }

    public String getDeploymentsURL() { return deploymentsURL; }
    public void setDeploymentsURL(String value) { this.deploymentsURL = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    /**
     * Returns whether or not this repository disabled.
     */
    public boolean getDisabled() { return disabled; }
    public void setDisabled(boolean value) { this.disabled = value; }

    public String getDownloadsURL() { return downloadsURL; }
    public void setDownloadsURL(String value) { this.downloadsURL = value; }

    public String getEventsURL() { return eventsURL; }
    public void setEventsURL(String value) { this.eventsURL = value; }

    public boolean getFork() { return fork; }
    public void setFork(boolean value) { this.fork = value; }

    public long getForks() { return forks; }
    public void setForks(long value) { this.forks = value; }

    public long getForksCount() { return forksCount; }
    public void setForksCount(long value) { this.forksCount = value; }

    public String getForksURL() { return forksURL; }
    public void setForksURL(String value) { this.forksURL = value; }

    public String getFullName() { return fullName; }
    public void setFullName(String value) { this.fullName = value; }

    public String getGitCommitsURL() { return gitCommitsURL; }
    public void setGitCommitsURL(String value) { this.gitCommitsURL = value; }

    public String getGitRefsURL() { return gitRefsURL; }
    public void setGitRefsURL(String value) { this.gitRefsURL = value; }

    public String getGitTagsURL() { return gitTagsURL; }
    public void setGitTagsURL(String value) { this.gitTagsURL = value; }

    public String getGitURL() { return gitURL; }
    public void setGitURL(String value) { this.gitURL = value; }

    /**
     * Whether discussions are enabled.
     */
    public Boolean getHasDiscussions() { return hasDiscussions; }
    public void setHasDiscussions(Boolean value) { this.hasDiscussions = value; }

    /**
     * Whether downloads are enabled.
     */
    public boolean getHasDownloads() { return hasDownloads; }
    public void setHasDownloads(boolean value) { this.hasDownloads = value; }

    /**
     * Whether issues are enabled.
     */
    public boolean getHasIssues() { return hasIssues; }
    public void setHasIssues(boolean value) { this.hasIssues = value; }

    public boolean getHasPages() { return hasPages; }
    public void setHasPages(boolean value) { this.hasPages = value; }

    /**
     * Whether projects are enabled.
     */
    public boolean getHasProjects() { return hasProjects; }
    public void setHasProjects(boolean value) { this.hasProjects = value; }

    /**
     * Whether the wiki is enabled.
     */
    public boolean getHasWiki() { return hasWiki; }
    public void setHasWiki(boolean value) { this.hasWiki = value; }

    public String getHomepage() { return homepage; }
    public void setHomepage(String value) { this.homepage = value; }

    public String getHooksURL() { return hooksURL; }
    public void setHooksURL(String value) { this.hooksURL = value; }

    public String getHTMLURL() { return htmlURL; }
    public void setHTMLURL(String value) { this.htmlURL = value; }

    /**
     * Unique identifier of the repository
     */
    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    /**
     * Whether this repository acts as a template that can be used to generate new repositories.
     */
    public Boolean getIsTemplate() { return isTemplate; }
    public void setIsTemplate(Boolean value) { this.isTemplate = value; }

    public String getIssueCommentURL() { return issueCommentURL; }
    public void setIssueCommentURL(String value) { this.issueCommentURL = value; }

    public String getIssueEventsURL() { return issueEventsURL; }
    public void setIssueEventsURL(String value) { this.issueEventsURL = value; }

    public String getIssuesURL() { return issuesURL; }
    public void setIssuesURL(String value) { this.issuesURL = value; }

    public String getKeysURL() { return keysURL; }
    public void setKeysURL(String value) { this.keysURL = value; }

    public String getLabelsURL() { return labelsURL; }
    public void setLabelsURL(String value) { this.labelsURL = value; }

    public String getLanguage() { return language; }
    public void setLanguage(String value) { this.language = value; }

    public String getLanguagesURL() { return languagesURL; }
    public void setLanguagesURL(String value) { this.languagesURL = value; }

    public LicenseSimple getLicense() { return license; }
    public void setLicense(LicenseSimple value) { this.license = value; }

    public String getMasterBranch() { return masterBranch; }
    public void setMasterBranch(String value) { this.masterBranch = value; }

    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     */
    public MergeCommitMessage getMergeCommitMessage() { return mergeCommitMessage; }
    public void setMergeCommitMessage(MergeCommitMessage value) { this.mergeCommitMessage = value; }

    /**
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull
     * request #123 from branch-name).
     */
    public MergeCommitTitle getMergeCommitTitle() { return mergeCommitTitle; }
    public void setMergeCommitTitle(MergeCommitTitle value) { this.mergeCommitTitle = value; }

    public String getMergesURL() { return mergesURL; }
    public void setMergesURL(String value) { this.mergesURL = value; }

    public String getMilestonesURL() { return milestonesURL; }
    public void setMilestonesURL(String value) { this.milestonesURL = value; }

    public String getMirrorURL() { return mirrorURL; }
    public void setMirrorURL(String value) { this.mirrorURL = value; }

    /**
     * The name of the repository.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getNodeID() { return nodeID; }
    public void setNodeID(String value) { this.nodeID = value; }

    public String getNotificationsURL() { return notificationsURL; }
    public void setNotificationsURL(String value) { this.notificationsURL = value; }

    public long getOpenIssues() { return openIssues; }
    public void setOpenIssues(long value) { this.openIssues = value; }

    public long getOpenIssuesCount() { return openIssuesCount; }
    public void setOpenIssuesCount(long value) { this.openIssuesCount = value; }

    /**
     * A GitHub user.
     */
    public OwnerClass getOwner() { return owner; }
    public void setOwner(OwnerClass value) { this.owner = value; }

    public Permissions getPermissions() { return permissions; }
    public void setPermissions(Permissions value) { this.permissions = value; }

    /**
     * Whether the repository is private or public.
     */
    public boolean getRepositoryPrivate() { return repositoryPrivate; }
    public void setRepositoryPrivate(boolean value) { this.repositoryPrivate = value; }

    public String getPullsURL() { return pullsURL; }
    public void setPullsURL(String value) { this.pullsURL = value; }

    public Date getPushedAt() { return pushedAt; }
    public void setPushedAt(Date value) { this.pushedAt = value; }

    public String getReleasesURL() { return releasesURL; }
    public void setReleasesURL(String value) { this.releasesURL = value; }

    /**
     * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is
     * initially created, the size is 0.
     */
    public long getSize() { return size; }
    public void setSize(long value) { this.size = value; }

    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     */
    public SquashMergeCommitMessage getSquashMergeCommitMessage() { return squashMergeCommitMessage; }
    public void setSquashMergeCommitMessage(SquashMergeCommitMessage value) { this.squashMergeCommitMessage = value; }

    /**
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull
     * request's title (when more than one commit).
     */
    public SquashMergeCommitTitle getSquashMergeCommitTitle() { return squashMergeCommitTitle; }
    public void setSquashMergeCommitTitle(SquashMergeCommitTitle value) { this.squashMergeCommitTitle = value; }

    public String getSSHURL() { return sshURL; }
    public void setSSHURL(String value) { this.sshURL = value; }

    public long getStargazersCount() { return stargazersCount; }
    public void setStargazersCount(long value) { this.stargazersCount = value; }

    public String getStargazersURL() { return stargazersURL; }
    public void setStargazersURL(String value) { this.stargazersURL = value; }

    public String getStarredAt() { return starredAt; }
    public void setStarredAt(String value) { this.starredAt = value; }

    public String getStatusesURL() { return statusesURL; }
    public void setStatusesURL(String value) { this.statusesURL = value; }

    public String getSubscribersURL() { return subscribersURL; }
    public void setSubscribersURL(String value) { this.subscribersURL = value; }

    public String getSubscriptionURL() { return subscriptionURL; }
    public void setSubscriptionURL(String value) { this.subscriptionURL = value; }

    public String getSvnURL() { return svnURL; }
    public void setSvnURL(String value) { this.svnURL = value; }

    public String getTagsURL() { return tagsURL; }
    public void setTagsURL(String value) { this.tagsURL = value; }

    public String getTeamsURL() { return teamsURL; }
    public void setTeamsURL(String value) { this.teamsURL = value; }

    public String getTempCloneToken() { return tempCloneToken; }
    public void setTempCloneToken(String value) { this.tempCloneToken = value; }

    public List<String> getTopics() { return topics; }
    public void setTopics(List<String> value) { this.topics = value; }

    public String getTreesURL() { return treesURL; }
    public void setTreesURL(String value) { this.treesURL = value; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date value) { this.updatedAt = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    /**
     * Whether a squash merge commit can use the pull request title as default. **This property
     * is closing down. Please use `squash_merge_commit_title` instead.
     */
    public Boolean getUseSquashPRTitleAsDefault() { return useSquashPRTitleAsDefault; }
    public void setUseSquashPRTitleAsDefault(Boolean value) { this.useSquashPRTitleAsDefault = value; }

    /**
     * The repository visibility: public, private, or internal.
     */
    public String getVisibility() { return visibility; }
    public void setVisibility(String value) { this.visibility = value; }

    public long getWatchers() { return watchers; }
    public void setWatchers(long value) { this.watchers = value; }

    public long getWatchersCount() { return watchersCount; }
    public void setWatchersCount(long value) { this.watchersCount = value; }

    /**
     * Whether to require contributors to sign off on web-based commits
     */
    public Boolean getWebCommitSignoffRequired() { return webCommitSignoffRequired; }
    public void setWebCommitSignoffRequired(Boolean value) { this.webCommitSignoffRequired = value; }
}

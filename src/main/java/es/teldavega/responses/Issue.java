package es.teldavega.responses;

import es.teldavega.responses.reactions.IssueReactions;
import es.teldavega.responses.users.AssigneeElement;
import es.teldavega.responses.users.FluffySimpleUser;
import es.teldavega.responses.users.IndigoSimpleUser;
import es.teldavega.responses.users.TentacledSimpleUser;

import java.time.OffsetDateTime;
import java.util.List;

public class Issue {
    private String activeLockReason;
    private FluffySimpleUser assignee;
    private List<AssigneeElement> assignees;
    private AuthorAssociation authorAssociation;
    private String body;
    private String bodyHTML;
    private String bodyText;
    private OffsetDateTime closedAt;
    private TentacledSimpleUser closedBy;
    private long comments;
    private String commentsURL;
    private OffsetDateTime createdAt;
    private Boolean draft;
    private String eventsURL;
    private String htmlURL;
    private long id;
    private List<LabelElement> labels;
    private String labelsURL;
    private boolean locked;
    private Milestone milestone;
    private String nodeID;
    private long number;
    private IssuePerformedViaGithubApp performedViaGithubApp;
    private PullRequest pullRequest;
    private IssueReactions reactions;
    private Repository repository;
    private String repositoryURL;
    private String state;
    private StateReason stateReason;
    private String timelineURL;
    private String title;
    private OffsetDateTime updatedAt;
    private String url;
    private IndigoSimpleUser user;
}

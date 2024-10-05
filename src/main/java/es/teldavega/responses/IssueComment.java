package es.teldavega.responses;

import es.teldavega.responses.reactions.CommentReactions;
import es.teldavega.responses.users.CommentSimpleUser;

import java.time.OffsetDateTime;

public class IssueComment {
    private AuthorAssociation authorAssociation;
    private String body;
    private String bodyHtml;
    private String bodyText;
    private OffsetDateTime createdAt;
    private String htmlUrl;
    private long id;
    private String issueUrl;
    private String nodeId;
    private CommentPerformedViaGithubApp performedViaGithubApp;
    private CommentReactions reactions;
    private OffsetDateTime updatedAt;
    private String url;
    private CommentSimpleUser user;
}

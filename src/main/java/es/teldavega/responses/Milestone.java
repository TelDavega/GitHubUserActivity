package es.teldavega.responses;

import es.teldavega.responses.users.MilestoneSimpleUser;

import java.time.OffsetDateTime;

public class Milestone {
    private OffsetDateTime closedAt;
    private long closedIssues;
    private OffsetDateTime createdAt;
    private MilestoneSimpleUser creator;
    private String description;
    private OffsetDateTime dueOn;
    private String htmlURL;
    private long id;
    private String labelsURL;
    private String nodeID;
    private long number;
    private long openIssues;
    private State state;
    private String title;
    private OffsetDateTime updatedAt;
    private String url;
}

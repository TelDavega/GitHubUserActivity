package es.teldavega.responses;

import es.teldavega.responses.actors.Actor;
import es.teldavega.responses.actors.Org;

import java.time.OffsetDateTime;

public class UserPublicEvents {
    private Actor actor;
    private OffsetDateTime createdAt;
    private String id;
    private Org org;
    private Payload payload;
    private boolean eventPublic;
    private Repo repo;
    private String type;
}

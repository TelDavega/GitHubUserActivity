package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;
import es.teldavega.responses.enums.EventType;

import java.util.Date;

/**
 * Event
 */
public class GithubUserEvent {
    private String id;
    private EventType type;
    private ActorClass actor;
    private Repo repo;
    private Payload payload;
    @SerializedName("public")
    private boolean eventPublic;
    @SerializedName("created_at")
    private Date createdAt;
    private OrgClass org;

    /**
     * Actor
     */
    public ActorClass getActor() { return actor; }
    public void setActor(ActorClass value) { this.actor = value; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date value) { this.createdAt = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    /**
     * Actor
     */
    public OrgClass getOrg() { return org; }
    public void setOrg(OrgClass value) { this.org = value; }

    public Payload getPayload() { return payload; }
    public void setPayload(Payload value) { this.payload = value; }

    public boolean getEventPublic() { return eventPublic; }
    public void setEventPublic(boolean value) { this.eventPublic = value; }

    public Repo getRepo() { return repo; }
    public void setRepo(Repo value) { this.repo = value; }

    public EventType getType() { return type; }
    public void setType(String value) { this.type = EventType.forValue(value); }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GithubUserEvent{");
        sb.append("id='").append(id).append('\'');
        sb.append(", type='").append(type.toValue()).append('\'');
        sb.append(", actor=").append(actor);
        sb.append(", repo=").append(repo);
        sb.append(", payload=").append(payload);
        sb.append(", eventPublic=").append(eventPublic);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", org=").append(org);
        sb.append('}');
        return sb.toString();
    }
}

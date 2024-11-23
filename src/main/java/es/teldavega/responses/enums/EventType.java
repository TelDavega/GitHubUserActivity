package es.teldavega.responses.enums;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.JsonAdapter;

import java.lang.reflect.Type;
import java.util.Map;

@JsonAdapter(EventType.EventTypeDeserializer.class)
public enum EventType {
    COMMIT_COMMENT("CommitCommentEvent"),
    CREATE("CreateEvent"),
    DELETE("DeleteEvent"),
    FORK("ForkEvent"),
    GOLLUM("GollumEvent"),
    ISSUE_COMMENT("IssueCommentEvent"),
    ISSUES("IssuesEvent"),
    MEMBER("MemberEvent"),
    PUBLIC("PublicEvent"),
    PULL_REQUEST("PullRequestEvent"),
    PULL_REQUEST_REVIEW("PullRequestReviewEvent"),
    PULL_REQUEST_REVIEW_COMMENT("PullRequestReviewCommentEvent"),
    PULL_REQUEST_REVIEW_THREAD("PullRequestReviewThreadEvent"),
    PUSH("PushEvent"),
    RELEASE("ReleaseEvent"),
    SPONSORSHIP("SponsorshipEvent"),
    WATCH("WatchEvent");

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    public String toValue() {
        return value;
    }

    public static EventType forValue(String value) {
        for (EventType eventType : EventType.values()) {
            if (eventType.toValue().equals(value)) {
                return eventType;
            }
        }
        return null;
    }

    public static final Map<EventType, String> eventMessages = Map.ofEntries(
            Map.entry(EventType.COMMIT_COMMENT, "commit comments in"),
            Map.entry(EventType.CREATE, "branches or tags created in"),
            Map.entry(EventType.DELETE, "deleted branches or tags in"),
            Map.entry(EventType.FORK, "forks in"),
            Map.entry(EventType.GOLLUM, "wikis pages created or updated in"),
            Map.entry(EventType.ISSUE_COMMENT, "issue comment events in"),
            Map.entry(EventType.ISSUES, "issues events in"),
            Map.entry(EventType.MEMBER, "member events in"),
            Map.entry(EventType.PUBLIC, "repositories changed from private to public in"),
            Map.entry(EventType.PULL_REQUEST, "pull request events in"),
            Map.entry(EventType.PULL_REQUEST_REVIEW, "pull request review events in"),
            Map.entry(EventType.PULL_REQUEST_REVIEW_COMMENT, "pull request review comment events in"),
            Map.entry(EventType.PULL_REQUEST_REVIEW_THREAD, "pull request review thread events in"),
            Map.entry(EventType.PUSH, "commits pushed in"),
            Map.entry(EventType.RELEASE, "release events in"),
            Map.entry(EventType.SPONSORSHIP, "sponsorship events in"),
            Map.entry(EventType.WATCH, "watch events in")
    );

    static class EventTypeDeserializer implements JsonDeserializer<EventType> {
        @Override
        public EventType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            String value = json.getAsString();
            return EventType.forValue(value);
        }
    }
}

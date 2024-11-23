package es.teldavega.responses.enums;

import java.io.IOException;

/**
 * How the author is associated with the repository.
 */
public enum AuthorAssociation {
    COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER;

    public String toValue() {
        switch (this) {
            case COLLABORATOR: return "COLLABORATOR";
            case CONTRIBUTOR: return "CONTRIBUTOR";
            case FIRST_TIMER: return "FIRST_TIMER";
            case FIRST_TIME_CONTRIBUTOR: return "FIRST_TIME_CONTRIBUTOR";
            case MANNEQUIN: return "MANNEQUIN";
            case MEMBER: return "MEMBER";
            case NONE: return "NONE";
            case OWNER: return "OWNER";
        }
        return null;
    }

    public static AuthorAssociation forValue(String value) throws IOException {
        if (value.equals("COLLABORATOR")) return COLLABORATOR;
        if (value.equals("CONTRIBUTOR")) return CONTRIBUTOR;
        if (value.equals("FIRST_TIMER")) return FIRST_TIMER;
        if (value.equals("FIRST_TIME_CONTRIBUTOR")) return FIRST_TIME_CONTRIBUTOR;
        if (value.equals("MANNEQUIN")) return MANNEQUIN;
        if (value.equals("MEMBER")) return MEMBER;
        if (value.equals("NONE")) return NONE;
        if (value.equals("OWNER")) return OWNER;
        throw new IOException("Cannot deserialize AuthorAssociation");
    }
}

package es.teldavega.responses.enums;

import java.io.IOException;

/**
 * The state of the milestone.
 */
public enum State {
    CLOSED, OPEN;

    public String toValue() {
        switch (this) {
            case CLOSED: return "closed";
            case OPEN: return "open";
        }
        return null;
    }

    public static State forValue(String value) throws IOException {
        if (value.equals("closed")) return CLOSED;
        if (value.equals("open")) return OPEN;
        throw new IOException("Cannot deserialize State");
    }
}

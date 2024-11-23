package es.teldavega.responses.enums;

import java.io.IOException;

public enum StateReason {
    COMPLETED, NOT_PLANNED, REOPENED;

    public String toValue() {
        switch (this) {
            case COMPLETED: return "completed";
            case NOT_PLANNED: return "not_planned";
            case REOPENED: return "reopened";
        }
        return null;
    }

    public static StateReason forValue(String value) throws IOException {
        if (value.equals("completed")) return COMPLETED;
        if (value.equals("not_planned")) return NOT_PLANNED;
        if (value.equals("reopened")) return REOPENED;
        throw new IOException("Cannot deserialize StateReason");
    }
}

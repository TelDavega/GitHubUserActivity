package es.teldavega.responses.enums;

import java.io.IOException;

/**
 * The default value for a squash merge commit message:
 *
 * - `PR_BODY` - default to the pull request's body.
 * - `COMMIT_MESSAGES` - default to the branch's commit messages.
 * - `BLANK` - default to a blank commit message.
 */
public enum SquashMergeCommitMessage {
    BLANK, COMMIT_MESSAGES, PR_BODY;

    public String toValue() {
        switch (this) {
            case BLANK: return "BLANK";
            case COMMIT_MESSAGES: return "COMMIT_MESSAGES";
            case PR_BODY: return "PR_BODY";
        }
        return null;
    }

    public static SquashMergeCommitMessage forValue(String value) throws IOException {
        if (value.equals("BLANK")) return BLANK;
        if (value.equals("COMMIT_MESSAGES")) return COMMIT_MESSAGES;
        if (value.equals("PR_BODY")) return PR_BODY;
        throw new IOException("Cannot deserialize SquashMergeCommitMessage");
    }
}

package es.teldavega.responses.enums;

import java.io.IOException;

/**
 * The default value for a merge commit message.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `PR_BODY` - default to the pull request's body.
 * - `BLANK` - default to a blank commit message.
 */
public enum MergeCommitMessage {
    BLANK, PR_BODY, PR_TITLE;

    public String toValue() {
        switch (this) {
            case BLANK: return "BLANK";
            case PR_BODY: return "PR_BODY";
            case PR_TITLE: return "PR_TITLE";
        }
        return null;
    }

    public static MergeCommitMessage forValue(String value) throws IOException {
        if (value.equals("BLANK")) return BLANK;
        if (value.equals("PR_BODY")) return PR_BODY;
        if (value.equals("PR_TITLE")) return PR_TITLE;
        throw new IOException("Cannot deserialize MergeCommitMessage");
    }
}

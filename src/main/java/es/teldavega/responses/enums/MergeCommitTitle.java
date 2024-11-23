package es.teldavega.responses.enums;

import java.io.IOException;

/**
 * The default value for a merge commit title.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull
 * request #123 from branch-name).
 */
public enum MergeCommitTitle {
    MERGE_MESSAGE, PR_TITLE;

    public String toValue() {
        switch (this) {
            case MERGE_MESSAGE: return "MERGE_MESSAGE";
            case PR_TITLE: return "PR_TITLE";
        }
        return null;
    }

    public static MergeCommitTitle forValue(String value) throws IOException {
        if (value.equals("MERGE_MESSAGE")) return MERGE_MESSAGE;
        if (value.equals("PR_TITLE")) return PR_TITLE;
        throw new IOException("Cannot deserialize MergeCommitTitle");
    }
}

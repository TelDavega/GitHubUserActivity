package es.teldavega.responses.enums;

import java.io.IOException;

/**
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull
 * request's title (when more than one commit).
 */
public enum SquashMergeCommitTitle {
    COMMIT_OR_PR_TITLE, PR_TITLE;

    public String toValue() {
        switch (this) {
            case COMMIT_OR_PR_TITLE: return "COMMIT_OR_PR_TITLE";
            case PR_TITLE: return "PR_TITLE";
        }
        return null;
    }

    public static SquashMergeCommitTitle forValue(String value) throws IOException {
        if (value.equals("COMMIT_OR_PR_TITLE")) return COMMIT_OR_PR_TITLE;
        if (value.equals("PR_TITLE")) return PR_TITLE;
        throw new IOException("Cannot deserialize SquashMergeCommitTitle");
    }
}

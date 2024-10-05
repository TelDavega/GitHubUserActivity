package es.teldavega.responses.reactions;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReactionTest {

    private static final String COMPLETE_JSON = "{\"+1\": 1, \"-1\": 2, \"confused\": 3, \"eyes\": 4, \"heart\": 5, \"hooray\": 6, \"laugh\": 7, \"rocket\": 8, \"total_count\": 36, \"url\": \"https://api.github.com/repos/octocat/Hello-World/issues/1347/reactions\"}";

    @Test
    void testDeserializeComplete() {
        Reaction reaction = new Gson().fromJson(COMPLETE_JSON, Reaction.class);
        completeReactionDeserializationAsserts(reaction);
    }

    private void completeReactionDeserializationAsserts(Reaction reaction) {
        assertEquals(1, reaction.getThe1());
        assertEquals(2, reaction.getReactionRollup1());
        assertEquals(3, reaction.getConfused());
        assertEquals(4, reaction.getEyes());
        assertEquals(5, reaction.getHeart());
        assertEquals(6, reaction.getHooray());
        assertEquals(7, reaction.getLaugh());
        assertEquals(8, reaction.getRocket());
        assertEquals(36, reaction.getTotalCount());
        assertEquals("https://api.github.com/repos/octocat/Hello-World/issues/1347/reactions", reaction.getUrl());
    }

}
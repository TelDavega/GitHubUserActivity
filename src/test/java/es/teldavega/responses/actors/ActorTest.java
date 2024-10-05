package es.teldavega.responses.actors;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ActorTest {

    private static final String COMPLETE_JSON = "{\"id\":1,\"login\":\"login\",\"display_login\":\"display_login\",\"gravatar_id\":\"gravatar_id\",\"avatar_url\":\"avatar_url\",\"url\":\"url\"}";

    @Test
    void testActorDeserializationComplete() {
        Actor actor = new Gson().fromJson(COMPLETE_JSON, Actor.class);
        completeActorDeserializationAsserts(actor);
    }

    @Test
    void testActorDeserializationEmpty() {
        Actor actor = new Gson().fromJson("{}", Actor.class);
        assertNull(actor.getAvatarUrl());
        assertNull(actor.getDisplayLogin());
        assertNull(actor.getGravatarId());
        assertEquals(0, actor.getId());
        assertNull(actor.getLogin());
        assertNull(actor.getUrl());
    }

    @Test
    void testActorDeserializationNull() {
        Actor actor = new Gson().fromJson("{\"avatar_url\":null,\"display_login\":null,\"gravatar_id\":null,\"id\":null,\"login\":null,\"url\":null}", Actor.class);
        assertNull(actor.getAvatarUrl());
        assertNull(actor.getDisplayLogin());
        assertNull(actor.getGravatarId());
        assertEquals(0, actor.getId());
        assertNull(actor.getLogin());
        assertNull(actor.getUrl());
    }

    @Test
    void testActorDeserializationEmptyString() {
        Actor actor = new Gson().fromJson("{\"avatar_url\":\"\",\"display_login\":\"\",\"gravatar_id\":\"\",\"id\":0,\"login\":\"\",\"url\":\"\"}", Actor.class);
        assertEquals("", actor.getAvatarUrl());
        assertEquals("", actor.getDisplayLogin());
        assertEquals("", actor.getGravatarId());
        assertEquals(0, actor.getId());
        assertEquals("", actor.getLogin());
        assertEquals("", actor.getUrl());
    }

    @Test
    void testOrgDeserialization() {
        Actor org = new Gson().fromJson(COMPLETE_JSON, Org.class);
        completeActorDeserializationAsserts(org);
    }

    private void completeActorDeserializationAsserts(Actor actor) {
        assertEquals(1, actor.getId());
        assertEquals("login", actor.getLogin());
        assertEquals("display_login", actor.getDisplayLogin());
        assertEquals("gravatar_id", actor.getGravatarId());
        assertEquals("avatar_url", actor.getAvatarUrl());
        assertEquals("url", actor.getUrl());
    }

}
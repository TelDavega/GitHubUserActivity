package es.teldavega.responses.users;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static final String COMPLETE_USER = """
                {
                  "avatar_url": "https://example.com/avatar.jpg",
                  "email": "user@example.com",
                  "events_url": "https://api.example.com/users/user/events",
                  "followers_url": "https://api.example.com/users/user/followers",
                  "following_url": "https://api.example.com/users/user/following",
                  "gists_url": "https://api.example.com/users/user/gists",
                  "gravatar_id": "123abc",
                  "html_url": "https://example.com/user",
                  "id": 123456,
                  "login": "user123",
                  "name": "John Doe",
                  "node_id": "MDQ6VXNlcjEyMzQ1Ng==",
                  "organizations_url": "https://api.example.com/users/user/orgs",
                  "received_events_url": "https://api.example.com/users/user/received_events",
                  "repos_url": "https://api.example.com/users/user/repos",
                  "site_admin": false,
                  "starred_at": "2023-10-05T12:34:56Z",
                  "starred_url": "https://api.example.com/users/user/starred",
                  "subscriptions_url": "https://api.example.com/users/user/subscriptions",
                  "type": "User",
                  "url": "https://api.example.com/users/user"
                }
                """;

    @Test
    void testUserDeserializationCompleteData() {
        User targetUser = new Gson().fromJson(COMPLETE_USER, User.class);
        completeUserDeserializationAsserts(targetUser);
    }

    private void completeUserDeserializationAsserts(User targetUser) {
        assertEquals("https://example.com/avatar.jpg", targetUser.getAvatarURL());
        assertEquals("user@example.com", targetUser.getEmail());
        assertEquals("https://api.example.com/users/user/events", targetUser.getEventsURL());
        assertEquals("https://api.example.com/users/user/followers", targetUser.getFollowersURL());
        assertEquals("https://api.example.com/users/user/following", targetUser.getFollowingURL());
        assertEquals("https://api.example.com/users/user/gists", targetUser.getGistsURL());
        assertEquals("123abc", targetUser.getGravatarID());
        assertEquals("https://example.com/user", targetUser.getHtmlURL());
        assertEquals(123456, targetUser.getId());
        assertEquals("user123", targetUser.getLogin());
        assertEquals("John Doe", targetUser.getName());
        assertEquals("MDQ6VXNlcjEyMzQ1Ng==", targetUser.getNodeID());
        assertEquals("https://api.example.com/users/user/orgs", targetUser.getOrganizationsURL());
        assertEquals("https://api.example.com/users/user/received_events", targetUser.getReceivedEventsURL());
        assertEquals("https://api.example.com/users/user/repos", targetUser.getReposURL());
        assertFalse(targetUser.isSiteAdmin());
        assertEquals("2023-10-05T12:34:56Z", targetUser.getStarredAt());
        assertEquals("https://api.example.com/users/user/starred", targetUser.getStarredURL());
        assertEquals("https://api.example.com/users/user/subscriptions", targetUser.getSubscriptionsURL());
        assertEquals("User", targetUser.getType());
        assertEquals("https://api.example.com/users/user", targetUser.getUrl());
    }

    @Test
    void testUserDeserializationMinimalData() {
        String json = """
                {
                  "avatar_url": "https://example.com/avatar.jpg",
                  "id": 123456,
                  "login": "user123",
                  "node_id": "MDQ6VXNlcjEyMzQ1Ng==",
                  "type": "User",
                  "url": "https://api.example.com/users/user"
                }
                """;
        User targetUser = new Gson().fromJson(json, User.class);
        assertEquals("https://example.com/avatar.jpg", targetUser.getAvatarURL());
        assertEquals(123456, targetUser.getId());
        assertEquals("user123", targetUser.getLogin());
        assertEquals("MDQ6VXNlcjEyMzQ1Ng==", targetUser.getNodeID());
        assertEquals("User", targetUser.getType());
        assertEquals("https://api.example.com/users/user", targetUser.getUrl());
    }

    @Test
    void testUserDeserializationNoData() {
        String json = "{}";
        User targetUser = new Gson().fromJson(json, User.class);
        assertNull(targetUser.getAvatarURL());
        assertEquals(0, targetUser.getId());
        assertNull(targetUser.getLogin());
        assertNull(targetUser.getNodeID());
        assertNull(targetUser.getType());
        assertNull(targetUser.getUrl());
    }

    @Test
    void testUserDeserializationNullData() {
        String json = """
                {
                  "avatar_url": null,
                  "id": null,
                  "login": null,
                  "node_id": null,
                  "type": null,
                  "url": null
                }
                """;
        User targetUser = new Gson().fromJson(json, User.class);
        assertNull(targetUser.getAvatarURL());
        assertEquals(0, targetUser.getId());
        assertNull(targetUser.getLogin());
        assertNull(targetUser.getNodeID());
        assertNull(targetUser.getType());
        assertNull(targetUser.getUrl());
    }

    @Test
    void testUserDeserializationEmptyData() {
        String json = """
                {
                  "avatar_url": "",
                  "id": 0,
                  "login": "",
                  "node_id": "",
                  "type": "",
                  "url": ""
                }
                """;
        User targetUser = new Gson().fromJson(json, User.class);
        assertEquals("", targetUser.getAvatarURL());
        assertEquals(0, targetUser.getId());
        assertEquals("", targetUser.getLogin());
        assertEquals("", targetUser.getNodeID());
        assertEquals("", targetUser.getType());
        assertEquals("", targetUser.getUrl());
    }

    @Test
    void testUserDeserializationInvalidData() {
        String json = """
                {
                  "avatar_url": 123456,
                  "id": "user123",
                  "login": 123456,
                  "node_id": 123456,
                  "type": 123456,
                  "url": 123456
                }
                """;
        Exception exception = assertThrows(Exception.class, () -> {
            new Gson().fromJson(json, User.class);
        });

        String expectedMessage = "java.lang.NumberFormatException: For input string: \"user123\"";
        String actualMessage = exception.getMessage();

    }

    @Test
    void testUserDeserializationInvalidTypeData() {
        String json = """
                {
                  "avatar_url": 123456,
                  "id": "user123",
                  "login": 123456,
                  "node_id": 123456,
                  "type": 123456,
                  "url": 123456
                }
                """;
        Exception exception = assertThrows(Exception.class, () -> {
            new Gson().fromJson(json, User.class);
        });
        String expectedMessage = "java.lang.NumberFormatException: For input string: \"user123\"";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testUserChildrenDeserializationComplete() {
        User assigneeElement = new Gson().fromJson(COMPLETE_USER, AssigneeElement.class);
        User commentSimpleUser = new Gson().fromJson(COMPLETE_USER, CommentSimpleUser.class);
        User fluffySimpleUser = new Gson().fromJson(COMPLETE_USER, FluffySimpleUser.class);
        User indigoSimpleUser = new Gson().fromJson(COMPLETE_USER, IndigoSimpleUser.class);
        User milestoneSimpleUser = new Gson().fromJson(COMPLETE_USER, MilestoneSimpleUser.class);
        User ownerElement = new Gson().fromJson(COMPLETE_USER, Owner.class);
        User purpleSimpleUser = new Gson().fromJson(COMPLETE_USER, PurpleSimpleUser.class);
        User stickySimpleUser = new Gson().fromJson(COMPLETE_USER, StickySimpleUser.class);
        User tentacledSimpleUser = new Gson().fromJson(COMPLETE_USER, TentacledSimpleUser.class);
        completeUserDeserializationAsserts(assigneeElement);
        completeUserDeserializationAsserts(commentSimpleUser);
        completeUserDeserializationAsserts(fluffySimpleUser);
        completeUserDeserializationAsserts(indigoSimpleUser);
        completeUserDeserializationAsserts(milestoneSimpleUser);
        completeUserDeserializationAsserts(ownerElement);
        completeUserDeserializationAsserts(purpleSimpleUser);
        completeUserDeserializationAsserts(stickySimpleUser);
        completeUserDeserializationAsserts(tentacledSimpleUser);
    }

}
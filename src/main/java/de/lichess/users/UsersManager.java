package de.lichess.users;

import de.lichess.LichessClient;
import de.lichess.Manager;
import de.lichess.users.activity.Activity;
import de.lichess.users.crosstable.Crosstable;
import de.lichess.users.iduser.IdUser;
import de.lichess.users.leaderboard.Leaderboard;
import de.lichess.users.leaderboard.prefType;
import de.lichess.users.livestreamer.LiveStreamer;
import de.lichess.users.performance.Performance;
import de.lichess.users.performance.perfTyp;
import de.lichess.users.ratinghistory.RatingHistory;
import de.lichess.users.status.UserStatus;
import de.lichess.users.team.TeamMember;
import de.lichess.users.top10.Top10;
import de.lichess.users.publicuser.PublicUser;
import de.lichess.utils.HashMapBuilder;
import de.lichess.utils.HttpsRequestBuilder;
import de.lichess.utils.HttpsRequestType;
import lombok.SneakyThrows;

import java.util.Arrays;

public class UsersManager extends Manager {

    public UsersManager(LichessClient lichessClient) {
        super(lichessClient, "user");
    }

    @SneakyThrows
    public UserStatus[] getRealtimeUserStatus(String[] ids) {
        String idsString = Arrays.asList(ids).toString().replaceAll("[\\[\\] ]","");
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getUrl() + "s/status", HttpsRequestType.GET, getLichessClient()).setPostParams(
                        new HashMapBuilder<String, String>().put("ids",idsString).build()).getResponse(), UserStatus[].class);
    }

    @SneakyThrows
    public Top10 getAllTop10() {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                ("https://lichess.org/player", HttpsRequestType.GET, getLichessClient())
                .setHeaderParameters(new HashMapBuilder<String, String>().put("Accept","application/vnd.lichess.v3+json")
                        .build()).getResponse(), Top10.class);
    }

    @SneakyThrows
    public Leaderboard getLeaderboard(int nb, prefType prefType) {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                ("https://lichess.org/player/top/" + nb + "/" + prefType.getName(), HttpsRequestType.GET, getLichessClient())
                .setHeaderParameters(new HashMapBuilder<String, String>().put("Accept","application/vnd.lichess.v3+json")
                        .build()).getResponse(), Leaderboard.class);
    }

    @SneakyThrows
    public PublicUser getPublicUserData(String username) {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getUrl() + "/" + username, HttpsRequestType.GET, getLichessClient())
                .getResponse(), PublicUser.class);
    }

    @SneakyThrows
    public RatingHistory[] getRatingHistory(String username) {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getUrl() + "/" + username + "/rating-history", HttpsRequestType.GET, getLichessClient())
                .getResponse(), RatingHistory[].class);
    }

    @SneakyThrows
    public Performance getPerformance(String username, perfTyp perfTyp) {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getUrl() + "/" + username + "/perf/" + perfTyp.getName(), HttpsRequestType.GET, getLichessClient())
                .getResponse(), Performance.class);
    }

    @SneakyThrows
    public Activity[] getActivity(String username) {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getUrl() + "/" + username + "/activity", HttpsRequestType.GET, getLichessClient())
                .getResponse(), Activity[].class);
    }

    @SneakyThrows
    public IdUser[] getUsersById(String[] ids) {
        String idsString = Arrays.asList(ids).toString().replaceAll("[\\[\\] ]","");
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getUrl() + "s", HttpsRequestType.POST, getLichessClient())
                .setPayload(idsString).getResponse(), IdUser[].class);
    }

    @SneakyThrows
    public TeamMember getTeamMembers(String teamId) {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getLichessClient().getBaseUrl() + "team/" + teamId + "/users", HttpsRequestType.GET, getLichessClient())
                .getResponse(), TeamMember.class);
    }

    @SneakyThrows
    public LiveStreamer[] getLiveStreamer() {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                ("https://lichess.org/streamer/live", HttpsRequestType.GET, getLichessClient())
                .getResponse(), LiveStreamer[].class);
    }

    @SneakyThrows
    public Crosstable getCrossTable(String user1, String user2) {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getLichessClient().getBaseUrl() + "crosstable/" + user1 + "/" + user2, HttpsRequestType.GET, getLichessClient())
                .getResponse(), Crosstable.class);
    }
}

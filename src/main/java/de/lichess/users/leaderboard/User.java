package de.lichess.users.leaderboard;

import de.lichess.users.top10.Perfs;
import lombok.Getter;

@Getter
public class User {

    private Perfs perfs;

    private String id;
    private String username;
    private String title;

    private boolean patron;
    private boolean online;
}

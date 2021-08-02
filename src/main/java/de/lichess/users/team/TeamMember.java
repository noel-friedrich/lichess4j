package de.lichess.users.team;

import de.lichess.account.account.Count;
import de.lichess.account.account.PlayTime;
import lombok.Getter;

@Getter
public class TeamMember {

    private Count count;
    private Perfs perfs;
    private Profile profile;
    private PlayTime playTime;

    private String id;
    private String url;
    private String title;
    private String playing;
    private String username;
    private String language;

    private int nbFollowing;
    private int nbFollowers;
    private int completionRate;

    private long seenAt;
    private long createdAt;

    private boolean patron;
    private boolean online;
    private boolean disabled;
    private boolean blocking;
    private boolean streaming;
    private boolean following;
    private boolean followsYou;
    private boolean followable;
    private boolean tosViolation;
}

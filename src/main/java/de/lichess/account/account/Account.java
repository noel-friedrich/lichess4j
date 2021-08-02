package de.lichess.account.account;

import lombok.Getter;

@Getter
public class Account {

    private Perfs perfs;
    private Count count;
    private Profile profile;
    private PlayTime playTime;

    private String id;
    private String url;
    private String title;
    private String playing;
    private String language;
    private String username;

    private int nbFollowing;
    private int nbFollowers;
    private int completionRate;

    private long seenAt;
    private long createdAt;

    private boolean patron;
    private boolean online;
    private boolean blocking;
    private boolean disabled;
    private boolean following;
    private boolean streaming;
    private boolean followable;
    private boolean followsYou;
    private boolean tosViolation;
}

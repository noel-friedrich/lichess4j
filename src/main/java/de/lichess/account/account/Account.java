package de.lichess.account.account;

import lombok.Getter;

@Getter
public class Account {

    public Perfs perfs;
    public Count count;
    public Profile profile;
    public PlayTime playTime;

    public String id;
    public String url;
    public String title;
    public String playing;
    public String language;
    public String username;

    public int nbFollowing;
    public int nbFollowers;
    public int completionRate;

    public long seenAt;
    public long createdAt;

    public boolean patron;
    public boolean online;
    public boolean blocking;
    public boolean disabled;
    public boolean following;
    public boolean streaming;
    public boolean followable;
    public boolean followsYou;
    public boolean tosViolation;
}

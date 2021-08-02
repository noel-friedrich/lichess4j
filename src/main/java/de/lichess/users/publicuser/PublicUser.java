package de.lichess.users.publicuser;

import de.lichess.account.account.Count;
import de.lichess.account.account.Perfs;
import de.lichess.account.account.PlayTime;
import de.lichess.account.account.Profile;
import lombok.Getter;

@Getter
public class PublicUser {

    private Count count;
    private Perfs perfs;
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

    private boolean online;
    private boolean patron;
    private boolean blocking;
    private boolean disabled;
    private boolean streaming;
    private boolean following;
    private boolean followable;
    private boolean followsYou;
    private boolean tosViolation;
}

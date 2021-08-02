package de.lichess.users.iduser;

import de.lichess.account.account.PlayTime;
import de.lichess.account.account.Profile;
import de.lichess.users.team.Perfs;
import lombok.Getter;

@Getter
public class IdUser {

    public Perfs perfs;
    public Profile profile;
    public PlayTime playTime;

    public String id;
    public String title;
    public String language;
    public String username;

    public long createdAt;
    public long seenAt;

    public boolean online;
    public boolean disabled;
    public boolean tosViolation;
    public boolean patron;
}

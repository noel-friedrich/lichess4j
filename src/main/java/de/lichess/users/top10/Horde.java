package de.lichess.users.top10;

import lombok.Getter;

@Getter
public class Horde {

    private Perfs perfs;

    private String id;
    private String username;
    private String title;

    private boolean patron;
    private boolean online;
}

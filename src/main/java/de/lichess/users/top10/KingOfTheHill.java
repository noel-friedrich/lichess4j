package de.lichess.users.top10;

import lombok.Getter;

@Getter
public class KingOfTheHill {

    private Perfs perfs;

    private String id;
    private String username;
    private String title;

    private boolean patron;
    private boolean online;
}

package de.lichess.users.activity;

import lombok.Getter;

@Getter
public class Best {

    private Tournament tournament;

    private int rank;
    private int score;
    private int nbGames;
    private int rankPercent;
}

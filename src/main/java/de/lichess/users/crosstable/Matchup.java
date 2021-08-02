package de.lichess.users.crosstable;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class Matchup {

    private HashMap<String, Double> users;
    public int nbGames;
}

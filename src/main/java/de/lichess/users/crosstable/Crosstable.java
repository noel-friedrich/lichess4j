package de.lichess.users.crosstable;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class Crosstable {

    private HashMap<String, Double> users;
    private Matchup matchup;

    private int nbGames;
}

package de.lichess.users.performance;

import lombok.Getter;

@Getter
public class Stat {

    private String _id;
    private UserId userId;
    private PerfType perfType;
    private BestWins bestWins;
    private WorstLosses worstLosses;
    private Count count;
    private ResultStreak resultStreak;
    private PlayStreak playStreak;
}

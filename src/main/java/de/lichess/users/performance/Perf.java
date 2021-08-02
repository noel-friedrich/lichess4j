package de.lichess.users.performance;

import lombok.Getter;

@Getter
public class Perf {

    private Glicko glicko;

    private int nb;
    private int progress;
}

package de.lichess.users.performance;

import lombok.Getter;

@Getter
public class Performance {

    private User user;
    private Perf perf;
    private Stat stat;

    private Object rank;
    private Object percentile;
}

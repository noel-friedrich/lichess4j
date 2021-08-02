package de.lichess.users.performance;

import lombok.Getter;

@Getter
public class Count {

    private int all;
    private int win;
    private int loss;
    private int draw;
    private int tour;
    private int rated;
    private int berserk;
    private int seconds;
    private int disconnects;

    private double opAvg;
}

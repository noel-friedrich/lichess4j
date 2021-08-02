package de.lichess.users.activity;


import lombok.Getter;

@Getter
public class Score {

    private Rp rp;

    private int win;
    private int loss;
    private int draw;
}

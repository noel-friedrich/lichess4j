package de.lichess.users.performance;

import lombok.Getter;

import java.util.Date;

@Getter
public class PlayStreak {

    private Nb nb;
    private Time time;
    private Date lastDate;
}

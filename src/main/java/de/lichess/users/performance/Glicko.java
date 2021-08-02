package de.lichess.users.performance;

import lombok.Getter;

@Getter
public class Glicko {

    private double rating;
    private double deviation;

    private boolean provisional;
}

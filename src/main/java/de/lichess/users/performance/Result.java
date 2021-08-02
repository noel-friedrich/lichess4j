package de.lichess.users.performance;

import lombok.Getter;

import java.util.Date;

@Getter
public class Result {

    private int opInt;
    private OpId opId;
    private Date at;
    private String gameId;
}

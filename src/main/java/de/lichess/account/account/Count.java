package de.lichess.account.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Count {

    private int ai;
    private int me;
    private int all;
    private int win;
    private int winH;
    private int draw;
    private int loss;
    private int rated;
    private int lossH;
    private int drawH;
    @JsonProperty("import")
    private int importt;
    private int playing;
    private int bookmark;
}

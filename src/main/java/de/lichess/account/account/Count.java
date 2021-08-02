package de.lichess.account.account;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Count {

    public int ai;
    public int me;
    public int all;
    public int win;
    public int winH;
    public int draw;
    public int loss;
    public int rated;
    public int lossH;
    public int drawH;
    @SerializedName("import")
    public int importt;
    public int playing;
    public int bookmark;
}

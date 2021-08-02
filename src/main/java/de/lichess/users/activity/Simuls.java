package de.lichess.users.activity;

import lombok.Getter;

import java.util.List;

@Getter
public class Simuls {

    public Score score;

    public String id;
    public String name;

    public boolean isHost;

    public List<String> variants;
}

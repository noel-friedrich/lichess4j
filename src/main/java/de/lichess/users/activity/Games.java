package de.lichess.users.activity;

import lombok.Getter;

@Getter
public class Games {

    private Blitz blitz;
    private Bullet bullet;
    private Opponent opponent;
    private Classical classical;
    private Crazyhouse crazyhouse;
    private UltraBullet ultraBullet;
    private Chess960 chess960;
    private Rapid rapid;
    private Antichess antichess;
    private Atomic atomic;
    private ThreeCheck threeCheck;
    private RacingKings racingKings;
    private KingOfTheHill kingOfTheHill;
    private Horde horde;

    private String id;
    private String color;
    private String url;
    private String variant;
    private String speed;
    private String perf;

    private boolean rated;
}

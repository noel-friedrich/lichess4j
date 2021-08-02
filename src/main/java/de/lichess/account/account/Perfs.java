package de.lichess.account.account;

import de.lichess.account.account.games.*;
import lombok.Getter;

@Getter
public class Perfs {

    private Blitz blitz;
    private Horde horde;
    private Rapid rapid;
    private Storm storm;
    private Atomic atomic;
    private Bullet bullet;
    private Puzzle puzzle;
    private Chess960 chess960;
    private Classical classical;
    private RacingKings racingKings;
    private UltraBullet ultraBullet;
    private KingOfTheHill kingOfTheHill;
    private Correspondence correspondence;
}

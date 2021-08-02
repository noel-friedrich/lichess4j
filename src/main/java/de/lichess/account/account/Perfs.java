package de.lichess.account.account;

import de.lichess.account.account.games.*;
import lombok.Getter;

@Getter
public class Perfs {

    public Blitz blitz;
    public Horde horde;
    public Rapid rapid;
    public Storm storm;
    public Atomic atomic;
    public Bullet bullet;
    public Puzzle puzzle;
    public Chess960 chess960;
    public Classical classical;
    public RacingKings racingKings;
    public UltraBullet ultraBullet;
    public KingOfTheHill kingOfTheHill;
    public Correspondence correspondence;
}

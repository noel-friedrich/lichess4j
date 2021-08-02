package de.lichess.users.top10;

import lombok.Getter;

import java.util.List;

@Getter
public class Top10 {

    public List<Bullet> bullet;
    public List<Blitz> blitz;
    public List<Rapid> rapid;
    public List<Classical> classical;
    public List<UltraBullet> ultraBullet;
    public List<Crazyhouse> crazyhouse;
    public List<Chess960> chess960;
    public List<KingOfTheHill> kingOfTheHill;
    public List<ThreeCheck> threeCheck;
    public List<Antichess> antichess;
    public List<Atomic> atomic;
    public List<Horde> horde;
    public List<RacingKings> racingKings;
}

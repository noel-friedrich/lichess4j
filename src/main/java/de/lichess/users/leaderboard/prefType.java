package de.lichess.users.leaderboard;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum prefType {

    ULTRABULLET("ultraBullet"),BULLET("bullet"),BLITZ("blitz"),RAPID("rapid"),
    CLASSICAL("classical"),CHESS960("chess960"),CRAZYHOUSE("crazyhouse"),ANTICHESS("antichess"),
    ATOMIC("atomic"),HORDE("horde"),KINGOFTHEHILL("kingOfTheHill"),RACINGKINGS("racingKings"),
    THREECHECK("threeCheck");

    @Getter
    private final String name;
}

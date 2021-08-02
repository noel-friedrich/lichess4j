package de.lichess.users.performance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum perfTyp {

    ULTRABULLET("ultraBullet"),BULLET("bullet"),BLITZ("blitz"),RAPID("rapid"),
    CLASSICAL("classical"),CORRESPONDENCE("correspondence"),CHESS960("chess960"),
    CRAZYHOUSE("crazyhouse"),ANTICHESS("antichess"), ATOMIC("atomic"),HORDE("horde"),
    KINGOFTHEHILL("kingOfTheHill"),RACINGKINGS("racingKings"),
    THREECHECK("threeCheck");

    @Getter
    private final String name;
}

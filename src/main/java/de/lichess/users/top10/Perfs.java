package de.lichess.users.top10;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Perfs{

    @JsonProperty("bullet")
    @JsonAlias({"blitz","rapid","classical","ultraBullet","chess960","crazyhouse","antichess","atomic",
            "horde","kingOfTheHill","racingKings","threeCheck"})
    private PerfsValues perfsValues;

}

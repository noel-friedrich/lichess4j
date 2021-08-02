package de.lichess.users.ratinghistory;

import lombok.Getter;

import java.util.List;

@Getter
public class RatingHistory {

    private String name;
    private List<List<Integer>> points;
}

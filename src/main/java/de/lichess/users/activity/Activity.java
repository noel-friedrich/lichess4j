package de.lichess.users.activity;

import lombok.Getter;

import java.util.List;

@Getter
public class Activity {

    private Games games;
    private Puzzles puzzles;
    private Follows follows;
    private Interval interval;
    private Storm storm;
    private Tournaments tournaments;
    private CorrespondenceEnds correspondenceEnds;
    private CorrespondenceMoves correspondenceMoves;

    private List<Team> teams;
    private List<Post> posts;
    private List<Simuls> simuls;
    private List<Practice> practice;

    private boolean stream;
}

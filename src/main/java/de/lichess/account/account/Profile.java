package de.lichess.account.account;

import lombok.Getter;

@Getter
public class Profile {

    private String bio;
    private String links;
    private String country;
    private String location;
    private String lastName;
    private String firstName;

    private int ecfRating;
    private int fideRating;
    private int uscfRating;
}

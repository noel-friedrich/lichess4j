package de.lichess.account.account;

import lombok.Getter;

@Getter
public class Profile {

    public String bio;
    public String links;
    public String country;
    public String location;
    public String lastName;
    public String firstName;

    public int ecfRating;
    public int fideRating;
    public int uscfRating;
}

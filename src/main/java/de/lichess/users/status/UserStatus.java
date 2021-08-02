package de.lichess.users.status;

import lombok.Getter;

@Getter
public class UserStatus {

    private String id;
    private String name;
    private String title;

    private boolean online;
    private boolean playing;
    private boolean streaming;
    private boolean patron;
}

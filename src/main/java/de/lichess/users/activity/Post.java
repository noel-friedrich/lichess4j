package de.lichess.users.activity;

import lombok.Getter;

import java.util.List;

@Getter
public class Post {

    private String topicUrl;
    private String topicName;
    private List<Post2> posts;
}

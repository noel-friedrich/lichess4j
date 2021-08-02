package de.lichess;

import lombok.Getter;

@Getter
public class Manager {

    private LichessClient lichessClient;
    private String url;

    public Manager(LichessClient lichessClient, String url) {
        this.lichessClient = lichessClient;
        this.url = lichessClient.getBaseUrl() + url;
    }

}

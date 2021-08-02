package de.lichess;

import com.google.gson.Gson;
import de.lichess.account.AccountManager;
import lombok.Getter;

@Getter
public class LichessClient {

    private String baseUrl = "https://lichess.org/api/";
    private final String token;
    private Gson gson;

    private AccountManager accountManager;

    public LichessClient(String token) {
        this.token = token;
        this.gson = new Gson();
        createManagers();
    }

    private void createManagers() {
        this.accountManager = new AccountManager(this);
    }
}

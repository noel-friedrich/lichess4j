package de.lichess;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.lichess.account.AccountManager;
import lombok.Getter;

import java.util.HashMap;

@Getter
public class LichessClient {

    private final String baseUrl = "https://lichess.org/api/";
    private final String token;
    private final ObjectMapper objectMapper;
    private final TypeReference<HashMap<String, String>> typeReference;

    private AccountManager accountManager;

    public LichessClient(String token) {
        this.token = token;
        this.objectMapper = new ObjectMapper();
        this.typeReference = new TypeReference<HashMap<String, String>>() {};
        createManagers();
    }

    private void createManagers() {
        this.accountManager = new AccountManager(this);
    }
}

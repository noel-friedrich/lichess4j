package de.lichess.account;

import com.fasterxml.jackson.core.type.TypeReference;
import de.lichess.LichessClient;
import de.lichess.account.account.Account;
import de.lichess.account.preferences.Preferences;
import de.lichess.utils.HashMapBuilder;
import de.lichess.utils.HttpsRequestBuilder;
import de.lichess.utils.HttpsRequestType;
import lombok.SneakyThrows;

import java.util.HashMap;

public class AccountManager {

    private LichessClient lichessClient;
    private String accountUrl;

    public AccountManager(LichessClient lichessClient) {
        this.lichessClient = lichessClient;
        this.accountUrl = lichessClient.getBaseUrl() + "account";
    }

    @SneakyThrows
    public Account getAccount() {
        return lichessClient.getObjectMapper().readValue(new HttpsRequestBuilder
                (accountUrl, HttpsRequestType.GET, lichessClient).getResponse(), Account.class);
    }

    @SneakyThrows
    public String getEmail() {
        return lichessClient.getObjectMapper().readValue(new HttpsRequestBuilder
                        (accountUrl + "/email", HttpsRequestType.GET, lichessClient).getResponse(),
                new TypeReference<HashMap<String, String>>() {}).get("email");
    }

    @SneakyThrows
    public Preferences getPreferences() {
        return lichessClient.getObjectMapper().readValue(new HttpsRequestBuilder
                (accountUrl + "/preferences", HttpsRequestType.GET, lichessClient).getResponse(), Preferences.class);
    }

    @SneakyThrows
    public boolean getKid() {
        return lichessClient.getObjectMapper().readValue(new HttpsRequestBuilder
                        (accountUrl + "/kid", HttpsRequestType.GET, lichessClient).getResponse(),
                new TypeReference<HashMap<String, Boolean>>() {}).get("kid");
    }

    @SneakyThrows
    public boolean setKid(boolean v) {
        return lichessClient.getObjectMapper().readValue(new HttpsRequestBuilder
                        (accountUrl + "/kid", HttpsRequestType.POST, lichessClient)
                        .setPostParams(new HashMapBuilder<String, String>().put("v",v +"").build()).getResponse(),
                new TypeReference<HashMap<String, Boolean>>() {}).get("ok");
    }

}

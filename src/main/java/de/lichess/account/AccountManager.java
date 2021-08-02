package de.lichess.account;

import com.fasterxml.jackson.core.type.TypeReference;
import de.lichess.LichessClient;
import de.lichess.Manager;
import de.lichess.account.account.Account;
import de.lichess.account.preferences.Preferences;
import de.lichess.utils.HashMapBuilder;
import de.lichess.utils.HttpsRequestBuilder;
import de.lichess.utils.HttpsRequestType;
import lombok.SneakyThrows;

import java.util.HashMap;

public class AccountManager extends Manager {

    public AccountManager(LichessClient lichessClient) {
        super(lichessClient,"account");
    }

    @SneakyThrows
    public Account getAccount() {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getUrl(), HttpsRequestType.GET, getLichessClient()).getResponse(), Account.class);
    }

    @SneakyThrows
    public String getEmail() {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                        (getUrl() + "/email", HttpsRequestType.GET, getLichessClient()).getResponse(),
                new TypeReference<HashMap<String, String>>() {}).get("email");
    }

    @SneakyThrows
    public Preferences getPreferences() {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                (getUrl() + "/preferences", HttpsRequestType.GET, getLichessClient()).getResponse(), Preferences.class);
    }

    @SneakyThrows
    public boolean getKid() {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                        (getUrl() + "/kid", HttpsRequestType.GET, getLichessClient()).getResponse(),
                new TypeReference<HashMap<String, Boolean>>() {}).get("kid");
    }

    @SneakyThrows
    public boolean setKid(boolean v) {
        return getLichessClient().getObjectMapper().readValue(new HttpsRequestBuilder
                        (getUrl() + "/kid", HttpsRequestType.POST, getLichessClient())
                        .setPostParams(new HashMapBuilder<String, String>().put("v",String.valueOf(v)).build()).getResponse(),
                new TypeReference<HashMap<String, Boolean>>() {}).get("ok");
    }

}

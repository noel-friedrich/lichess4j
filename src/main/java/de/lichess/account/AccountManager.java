package de.lichess.account;

import de.lichess.LichessClient;
import de.lichess.account.account.Account;
import de.lichess.account.email.Email;
import de.lichess.account.kid.Kid;
import de.lichess.account.preferences.Preferences;
import de.lichess.utils.HttpsRequestBuilder;
import de.lichess.utils.HttpsRequestType;

public class AccountManager {

    private LichessClient lichessClient;
    private String accountUrl;

    public AccountManager(LichessClient lichessClient) {
        this.lichessClient = lichessClient;
        this.accountUrl = lichessClient.getBaseUrl() + "account";
    }

    public Account getAccount() {
        return lichessClient.getGson().fromJson(new HttpsRequestBuilder
                (accountUrl, HttpsRequestType.GET, lichessClient).getResponse(), Account.class);
    }

    public String getEmail() {
        return lichessClient.getGson().fromJson(new HttpsRequestBuilder
                (accountUrl + "/email", HttpsRequestType.GET, lichessClient).getResponse(), Email.class).getEmail();
    }

    public Preferences getPreferences() {
        return lichessClient.getGson().fromJson(new HttpsRequestBuilder
                (accountUrl + "/preferences", HttpsRequestType.GET, lichessClient).getResponse(), Preferences.class);
    }

    public boolean getKid() {
        return lichessClient.getGson().fromJson(new HttpsRequestBuilder
                (accountUrl + "/kidl", HttpsRequestType.GET, lichessClient).getResponse(), Kid.class).isKid();
    }

}

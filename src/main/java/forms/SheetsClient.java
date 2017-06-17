package forms;

import com.google.api.client.auth.oauth2.Credential;

/**
 * Created by elias on 07/06/17.
 */
public class SheetsClient {

    private final String ID;

    public SheetsClient(Credential credential, String URL){
        this.ID = parseID(URL);
    }

    private String parseID(String URL){
        String[] ID = URL.split("/");

    }
}

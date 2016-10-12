import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

/**
 * Created by Agustin on 10/12/2016.
 */
public class RTDBManager {

    private String dataBaseUrl;
    private String filePermissionPath;
    private FirebaseDatabase database;

    public RTDBManager(String dataBaseUrl, String filePermissionPath) {
        this.dataBaseUrl = dataBaseUrl;
        this.filePermissionPath = filePermissionPath;
    }

    public void load() {
        try {
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setServiceAccount(new FileInputStream(getClass().getResource(this.filePermissionPath).getPath()))
                    .setDatabaseUrl(this.dataBaseUrl)
                    .build();
            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: invalid service account credentials. See README.");
            System.out.println(e.getMessage());
            System.exit(1);
        }
        this.database = FirebaseDatabase.getInstance();
    }

    public void saveMessage(String node, Map<String, Message> messages) {
        DatabaseReference ref = this.database.getReference();
        ref.setValue(null);

    }
}

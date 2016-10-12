import java.util.Map;

/**
 * Created by Agustin on 10/12/2016.
 */


public class Main {


    public static void main(String[] args) {
        String keyPaths = "service-account.json";
        String dbUrl = "https://agrojas-e19a9.firebaseio.com/";
        String node = "users3";

        MessagesHelper messagesHelper = new MessagesHelper();
        Map<String, Message> messages = messagesHelper.getMockMessages();

        RTDBManager rtdbManager = new RTDBManager(dbUrl,keyPaths);
        rtdbManager.load();
        rtdbManager.saveMessage(node,messages);

    }
}

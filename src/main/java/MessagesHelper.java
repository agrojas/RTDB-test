import java.util.HashMap;
import java.util.Map;

/**
 * Created by Agustin on 10/12/2016.
 */
public class MessagesHelper {


    public MessagesHelper() {
    }

    public Map<String, Message> getMockMessages() {
        Map<String, Message> messages = new HashMap<String, Message>();
        messages.put("alanisawesome", new Message("June 23, 1912", "Alan Turing"));
        messages.put("gracehop", new Message("December 9, 1906", "Grace Hopper"));
        return messages;
    }
}

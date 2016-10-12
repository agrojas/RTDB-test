public class Message {

    private String data;
    private String from;

    public Message() {
        this.data = "";
        this.from = "";
    }
    public Message(String data, String from) {
        this.data = data;
        this.from = from;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}

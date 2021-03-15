package pl.wiktor.example.api.dto.request;

public class AddMessageToRoom {
    private String note;
    private String userId;

    public AddMessageToRoom() {
    }

    public AddMessageToRoom(String note, String userId) {
        this.note = note;
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public String getUserId() {
        return userId;
    }
}

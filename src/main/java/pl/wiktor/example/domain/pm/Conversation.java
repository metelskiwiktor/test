package pl.wiktor.example.domain.pm;


import pl.wiktor.example.domain.user.Useres;

public class Conversation {
    private final Useres from;
    private final String lastMessageText;

    public Conversation(Useres from, String lastMessageText) {
        this.from = from;
        this.lastMessageText = lastMessageText;
    }

    public Useres getFrom() {
        return from;
    }

    public String getLastMessageText() {
        return lastMessageText;
    }
}

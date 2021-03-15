package pl.wiktor.example.domain.pm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.wiktor.example.domain.user.Useres;

import java.time.LocalDateTime;

@Document
public class PrivateMessage {
    @Id
    private String id;
    private Useres from;
    private Useres to;
    private String message;
    private LocalDateTime createdAt;

    public PrivateMessage() {
    }

    public PrivateMessage(Useres from, Useres to, String message, LocalDateTime createdAt) {
        this.from = from;
        this.to = to;
        this.message = message;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Useres getFrom() {
        return from;
    }

    public void setFrom(Useres from) {
        this.from = from;
    }

    public Useres getTo() {
        return to;
    }

    public void setTo(Useres to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

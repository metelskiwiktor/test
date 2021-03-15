package pl.wiktor.example.domain.room;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.wiktor.example.domain.user.Useres;

import java.time.LocalDateTime;

@Document
public class RoomMessage {
    @Id
    private String id;
    private String note;
    private LocalDateTime createdAt;
    private Useres author;

    public RoomMessage() {
    }

    public RoomMessage(String id, String note, LocalDateTime createdAt, Useres author) {
        this.id = id;
        this.note = note;
        this.createdAt = createdAt;
        this.author = author;
    }

    public RoomMessage(String note, LocalDateTime createdAt, Useres author) {
        this.note = note;
        this.createdAt = createdAt;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Useres getAuthor() {
        return author;
    }

    public void setAuthor(Useres author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "RoomMessage{" +
                "id='" + id + '\'' +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                ", author=" + author +
                '}';
    }
}

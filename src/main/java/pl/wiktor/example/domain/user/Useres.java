package pl.wiktor.example.domain.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Useres {
    @Id
    private String id;
    private String login;

    public Useres(String id, String login) {
        this.id = id;
        this.login = login;
    }

    public Useres(String login) {
        this.login = login;
    }

    public Useres() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}

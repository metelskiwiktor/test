package pl.wiktor.example;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String login;

    public User() {
    }

    public User(String id, String login) {
        this.id = id;
        this.login = login;
    }

    public User(String login) {
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setId(String id) {
        this.id = id;
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

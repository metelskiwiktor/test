package pl.wiktor.example.domain.pm;

import java.util.List;

public interface PrivateMessageRepository {
    List<PrivateMessage> findAll();

    PrivateMessage save(PrivateMessage privateMessage);
}

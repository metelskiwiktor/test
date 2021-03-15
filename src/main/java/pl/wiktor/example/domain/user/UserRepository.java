package pl.wiktor.example.domain.user;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<Useres> findAll();

    Useres save(Useres user);

    Optional<Useres> findById(String userId);

    void deleteAll();
}

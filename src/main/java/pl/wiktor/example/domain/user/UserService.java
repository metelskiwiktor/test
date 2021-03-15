package pl.wiktor.example.domain.user;

import org.springframework.stereotype.Service;
import pl.wiktor.example.domain.exception.DomainException;
import pl.wiktor.example.domain.exception.ExceptionCode;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Useres getById(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new DomainException(ExceptionCode.NO_SUCH_USER, userId));
    }
}

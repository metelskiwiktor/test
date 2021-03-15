package pl.wiktor.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

@RestController
public class GreetingsController {
    private final UserRepository userRepository;

    public GreetingsController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    private String hello() {
        return "Hello! " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss"));
    }

    @GetMapping("/greetings")
    private String greetings() {
        return "Greetings! You've reached this!";
    }

    @GetMapping("/users")
    private String getUsers() {
        userRepository.save(new User(String.valueOf(new Random().nextInt(20000))));

        List<User> all = userRepository.findAll();

        return all.toString();
    }
}

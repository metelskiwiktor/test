package pl.wiktor.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class GreetingsController {
    @GetMapping
    private String hello() {
        return "Hello! " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss"));
    }

    @GetMapping("/greetings")
    private String greetings() {
        return "Greetings! You've reached this!";
    }
}

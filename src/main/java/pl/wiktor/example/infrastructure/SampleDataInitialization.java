package pl.wiktor.example.infrastructure;

import org.bson.types.ObjectId;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.wiktor.example.domain.pm.PrivateMessageRepository;
import pl.wiktor.example.domain.room.Room;
import pl.wiktor.example.domain.room.RoomMessage;
import pl.wiktor.example.domain.room.RoomRepository;
import pl.wiktor.example.domain.user.Useres;
import pl.wiktor.example.domain.user.UserRepository;

import java.time.LocalDateTime;
import java.util.Arrays;

@Profile("init")
@Component
public class SampleDataInitialization implements ApplicationRunner {
    private final PrivateMessageRepository privateMessageRepository;
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;

    public SampleDataInitialization(PrivateMessageRepository privateMessageRepository,
                                    RoomRepository roomRepository,
                                    UserRepository userRepository) {
        this.privateMessageRepository = privateMessageRepository;
        this.roomRepository = roomRepository;
        this.userRepository = userRepository;
    }

    private void saveSampleDataIfRepoEmpty() {
        System.out.println("===============================\nSTARTING INITIALIZATION");
        int pmSize = privateMessageRepository.findAll().size();
        int rSize = roomRepository.findAll().size();
        int uSize = userRepository.findAll().size();

        if (pmSize > 0 || rSize > 0 || uSize > 0) return;

        Useres wihajster = new Useres("wihajster123");
        Useres ziomek = new Useres("ziomek");

        userRepository.save(wihajster);
        userRepository.save(ziomek);

        RoomMessage testNote1 = new RoomMessage(
                new ObjectId().toString(),
                "testnote1",
                LocalDateTime.now(),
                wihajster
        );

        RoomMessage testNote2 = new RoomMessage(
                new ObjectId().toString(),
                "testnote2",
                LocalDateTime.now(),
                ziomek
        );

        Room room = new Room(
                "#3403",
                Arrays.asList(testNote1, testNote2)
        );

        roomRepository.save(room);

        roomRepository.findAll()
                .forEach(System.out::println);

        System.out.println("END OF INITIALIZATION\n===============================");
    }

    @Override
    public void run(ApplicationArguments args) {
        saveSampleDataIfRepoEmpty();
    }
}

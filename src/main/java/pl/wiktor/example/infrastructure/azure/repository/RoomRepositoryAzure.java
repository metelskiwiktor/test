package pl.wiktor.example.infrastructure.azure.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import pl.wiktor.example.domain.room.Room;
import pl.wiktor.example.domain.room.RoomRepository;

public interface RoomRepositoryAzure extends RoomRepository, MongoRepository<Room, String> {
    boolean existsByName(String name);
}

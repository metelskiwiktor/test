package pl.wiktor.example.infrastructure.azure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.wiktor.example.domain.user.Useres;
import pl.wiktor.example.domain.user.UserRepository;

public interface UserRepositoryAzure extends UserRepository, MongoRepository<Useres, String> {
}

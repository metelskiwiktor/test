package pl.wiktor.example.infrastructure.azure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.wiktor.example.domain.pm.PrivateMessage;
import pl.wiktor.example.domain.pm.PrivateMessageRepository;

public interface PrivateMessageRepositoryAzure extends PrivateMessageRepository, MongoRepository<PrivateMessage, String> {
}

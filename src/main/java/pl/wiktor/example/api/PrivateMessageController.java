package pl.wiktor.example.api;

import org.springframework.web.bind.annotation.*;
import pl.wiktor.example.domain.pm.Conversation;
import pl.wiktor.example.domain.pm.PrivateMessage;
import pl.wiktor.example.domain.pm.PrivateMessageService;

import java.util.List;

@RestController
@RequestMapping("/message/private")
public class PrivateMessageController {
    private final PrivateMessageService privateMessageService;

    public PrivateMessageController(PrivateMessageService privateMessageService) {
        this.privateMessageService = privateMessageService;
    }

    @PostMapping
    public void addPrivateMessage(@RequestBody PrivateMessage privateMessage) {
        privateMessageService.addMessage(privateMessage);
    }

    @GetMapping("/get-all")
    public List<PrivateMessage> getPrivateMessages(@RequestParam("recipient-id") String recipientId) {
        return privateMessageService.getMessages(recipientId);
    }

    @GetMapping("/conversations")
    public List<Conversation> getConversations(@RequestParam("user-id") String userId) {
        return privateMessageService.getConversations(userId);
    }
}

package pl.wiktor.example.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wiktor.example.api.dto.request.AddMessageToRoom;
import pl.wiktor.example.api.dto.response.RoomMessageView;
import pl.wiktor.example.api.dto.response.RoomView;
import pl.wiktor.example.domain.room.RoomService;

import java.util.List;

@RestController
@RequestMapping("/message/room")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("/create")
    public ResponseEntity<RoomView> createRoom(@RequestBody String roomName) {
        return new ResponseEntity<>(roomService.createRoom(roomName), HttpStatus.CREATED);
    }

    @PostMapping("/{room-id}")
    public void addMessage(@PathVariable("room-id") String roomId, @RequestBody AddMessageToRoom addMessageToRoom) {
        roomService.addMessage(roomId, addMessageToRoom);
    }

    @GetMapping("/{room-id}")
    public List<RoomMessageView> getMessages(@PathVariable("room-id") String roomId) {
        return roomService.getMessages(roomId);
    }

    @DeleteMapping
    public void deleteMessage(@RequestParam("message-id") String messageId) {
        roomService.deleteMessage(messageId);
    }
}

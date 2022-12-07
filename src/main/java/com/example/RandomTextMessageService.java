package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component("randomTextMessageService")
@Scope("prototype")
public class RandomTextMessageService implements MessageService {

    Random random = new Random();

    private List<String> messages = List.of(
            "msg0",
            "msg1",
            "msg2",
            "msg3",
            "msg4",
            "msg5",
            "msg6",
            "msg7",
            "msg8",
            "msg9"
    );

    @Override
    public String getMessage() {
        int randomIndex = random.nextInt(10);
        return messages.get(randomIndex);
    }
}

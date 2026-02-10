package com.example.shop62.processor;


import com.example.shop62.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {
    private final MessageService messageService;

    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("com.example.shop62.processor.MessageProcessor created with: " + messageService.getClass().getSimpleName());
    }

    public void processMessage(String message, String recipient) {
        System.out.println("\n=== Processing Message ===");
        messageService.sendMessage(message, recipient);
        System.out.println("\n=== Message Processed ===\n");
    }
}

package com.stackjs.resourceserver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stackjs.resourceserver.model.Message;
import com.stackjs.resourceserver.repository.MessageRepository;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    public Optional<Message> findById(long id) {
        return messageRepository.findById(id);
    }

    public Message save(Message message) {
        return messageRepository.save(message);
    }

}

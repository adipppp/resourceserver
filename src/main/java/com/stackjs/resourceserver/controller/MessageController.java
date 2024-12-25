package com.stackjs.resourceserver.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackjs.resourceserver.model.Message;
import com.stackjs.resourceserver.service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping({"", "/"})
    public List<Message> findAll() {
        return messageService.findAll();
    }

    @GetMapping({"/{id}", "/{id}/"})
    public Message findById(@PathVariable String id) {
        long idInt64;
        try {
            idInt64 = Long.parseLong(id);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Id is not a number: " + id);
        }
        return messageService.findById(idInt64).get();
    }

}

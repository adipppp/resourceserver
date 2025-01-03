package com.stackjs.resourceserver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Message {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String content;

}

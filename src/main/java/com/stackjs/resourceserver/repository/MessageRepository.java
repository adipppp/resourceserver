package com.stackjs.resourceserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackjs.resourceserver.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}

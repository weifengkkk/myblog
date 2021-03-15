package com.example.myblog.service;

import com.example.myblog.pojo.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface MessageService {

    Message saveMessage(Message message);

    Page<Message> listMessage(Pageable pageable);

    void findParentMessage(Message message);
}

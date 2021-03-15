package com.example.myblog.dao;

import com.example.myblog.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MessageRepository extends JpaRepository<Message,Long>, JpaSpecificationExecutor<Message> {

}

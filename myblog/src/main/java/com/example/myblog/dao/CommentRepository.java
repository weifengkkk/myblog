package com.example.myblog.dao;

import com.example.myblog.pojo.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentRepository extends JpaRepository<Comment,Long> {


    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}

package com.example.myblog.service;

import com.example.myblog.pojo.Blog;
import com.example.myblog.pojo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {
    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    Page<Blog> listBlog(org.springframework.data.domain.Pageable pageable, BlogQuery blog); //Blog封装了查询博客的过滤条件


    Page<Blog> listBlog(org.springframework.data.domain.Pageable pageable);

    Page<Blog> listBlog(Long tagId, org.springframework.data.domain.Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(String query, Pageable pageable);

    List<Blog> listRecommendBlogTop(Integer size);

    List<Blog> listNewBlog(Integer size);

    Map<String,List<Blog>> archiveBlog();

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id,Blog blog);

    void deleteBlog(Long id);
    Long countBlog();

}

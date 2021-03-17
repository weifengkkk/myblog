package com.example.myblog.service;

import com.example.myblog.pojo.Blog;
import com.example.myblog.pojo.User;

public interface UserService {
    User cheakUser(String name, String password);
    User isExistUser(String name);
    void saveUser(User user);
}

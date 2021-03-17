package com.example.myblog.service;

import com.example.myblog.dao.UserRepository;
import com.example.myblog.pojo.Blog;
import com.example.myblog.pojo.User;
import com.example.myblog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User cheakUser(String name, String password) {
        User user = userRepository.findByUsernameAndPassword(name, password);
        return user;
    }
    public User isExistUser(String name){
        User user = userRepository.findByUsername(name);
        return user;
    }
    public void saveUser(User user){
        userRepository.save(user);
    }

}

package com.example.myblog.web;

import com.example.myblog.pojo.User;
import com.example.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;
    @GetMapping("/register")
    public String loginRegister(){
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password, RedirectAttributes attributes){
        User user = userService.isExistUser(username);
        if (user == null){
            user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setAvatar("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2687984291,550916239&fm=26&gp=0.jpg");
            user.setNickname(username);
            user.setCreateTime(new Date());
            userService.saveUser(user);
            attributes.addFlashAttribute("message","恭喜你,注册成功！");
            return "redirect:/";
        }else {
            attributes.addFlashAttribute("message","该用户已被注册");
            return "redirect:/register";
        }

    }
}

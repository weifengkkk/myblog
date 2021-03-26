package com.example.myblog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicPlayerController {
    @GetMapping("/player")
    public String playerIndex(){
        return "musicPlayer/index";
    }
}

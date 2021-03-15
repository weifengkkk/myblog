package com.example.myblog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private final Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);

    public void addResourceHandlers(ResourceHandlerRegistry registry){
        logger.info("add resourceHandlers");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}

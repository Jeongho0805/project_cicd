package com.example.project_cicd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MyController {

    @GetMapping("/")
    public String testNginxConnection() {
        log.info("index.html 호출");
        return "index";
    }

    @GetMapping("/my")
    public String testNginxConnection2() {
        log.info("my.html 호출");
        return "my";
    }
}

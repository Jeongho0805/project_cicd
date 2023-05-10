package com.example.project_cicd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping
    public String test() {
        log.info("requestUri => api");
        return "나 성공한거야? ㅜㅜ";
    }

    @GetMapping("/jeongho")
    public String test2() {
        log.info("requestUri => api/jeongho");
        return "경로 계층 구조 매칭 성공";
    }
}

package com.example.project_cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping
    public String test() {
        return "나 성공한거야? ㅜㅜ";
    }

    @GetMapping("jeongho")
    public String test2() {
        return "경로 계층 구조 매칭 성공";
    }
}

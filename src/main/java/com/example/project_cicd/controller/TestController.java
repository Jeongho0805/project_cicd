package com.example.project_cicd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@Slf4j
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping
    public String test() {
        log.info("requestUri => api");
        return "무중단 배포 테스트! 한번더 바꾸기";
    }

    @GetMapping("/jeongho")
    public String test2() {
        log.info("requestUri => api/jeongho");
        return "경로 계층 구조 매칭 성공";
    }
}

package com.princeton.githubactionstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/v1")
    public String testV1() {
        return "hello test version 1";
    }

    @GetMapping("/v2")
    public String testV2() {
        return "hello test version 2";
    }

}

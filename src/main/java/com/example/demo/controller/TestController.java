package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Faker
 * @description: TODO
 * @date 2023/01/26 22:55
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("get/{t}")
    public Object get(@PathVariable String t) {
        return t;
    }
}

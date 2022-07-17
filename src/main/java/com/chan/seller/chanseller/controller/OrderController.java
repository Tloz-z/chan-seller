package com.chan.seller.chanseller.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("seller")
public class OrderController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
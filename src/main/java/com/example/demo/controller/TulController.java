package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TulController {


    @GetMapping("/tul")
    public String getTul() {
        return "Change for commit 2";
    }

    @GetMapping("/tul2")
    public int gettul2(){
        return  200;
    }
}

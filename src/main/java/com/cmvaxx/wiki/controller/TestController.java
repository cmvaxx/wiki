package com.cmvaxx.wiki.controller;

import com.cmvaxx.wiki.domain.Test;
import com.cmvaxx.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @GetMapping("/list")
    public List<Test> list(){
        return testService.list();
    }



}

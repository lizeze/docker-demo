package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lzz
 * @BelongsProject: com.example.demo
 * @date ：Created in 2020/7/30 13:36
 * @description ：
 * @modified By：
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/")
    public String Test() {

        return "Docker12345";
    }
    @GetMapping("/a")
    public String Test1() {

        return "这是新加的一个api";
    }

}

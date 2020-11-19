package com.yangjie.example.springbootredis.controller;


import com.yangjie.Test2Service;
import com.yangjie.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    //RedisTemplate 必须带泛型 不带泛型报错
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private TestService testService;


    @RequestMapping("/show")
    public String insert() {
        System.out.println(testService);
        System.out.println(redisTemplate.opsForValue().get("name"));
        return redisTemplate.opsForValue().get("name").toString();
    }
}

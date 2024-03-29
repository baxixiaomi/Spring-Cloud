package com.baxixiaomi.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.baxixiaomi.springboot.pojo.User;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    private User findUserById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:8000/"+id,User.class);
    }
}

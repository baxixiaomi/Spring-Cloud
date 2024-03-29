package com.baxixiaomi.springboot.controller;

import com.baxixiaomi.springboot.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.baxixiaomi.springboot.pojo.User;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    private User findUserById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }

//    @GetMapping("/1")
//    private String findUserById(){
//        return "hello world";
//    }
}

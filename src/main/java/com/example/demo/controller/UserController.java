package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    // @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @GetMapping(value = "/findAll")
    public List<User> getAllUsers() {
        System.out.println("XXX - found");
        return userService.findAll();
    }
    
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id) {
        userService.delete(id);
    }
}

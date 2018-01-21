package com.javasampleapproach.mongodbrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.javasampleapproach.mongodbrestapi.model.User;
import com.javasampleapproach.mongodbrestapi.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody User user){
        userRepository.save(user);
    }

    @RequestMapping(value = "{id}")
    public User read(@PathVariable String id){
        return  userRepository.findOne(id);
    }




    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody User user){
        userRepository.save(user);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        userRepository.delete(id);
    }

}

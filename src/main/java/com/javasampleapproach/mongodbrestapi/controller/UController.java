package com.javasampleapproach.mongodbrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.javasampleapproach.mongodbrestapi.model.User;
import com.javasampleapproach.mongodbrestapi.repository.UserRepository;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/auth")
public class UController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody User user, HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        userRepository.save(user);
    }

    @RequestMapping(value = "/{id}")
    public User read(@PathVariable String id, HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        return  userRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody User user, HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        userRepository.save(user);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id, HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        userRepository.delete(id);
    }

}

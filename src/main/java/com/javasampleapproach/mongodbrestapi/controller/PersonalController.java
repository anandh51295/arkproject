package com.javasampleapproach.mongodbrestapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.mongodbrestapi.model.Personal;
import com.javasampleapproach.mongodbrestapi.repository.PersonalRepository;

@RestController
@RequestMapping("/admin")
public class PersonalController {
    @Autowired
    PersonalRepository personalRepository;
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Personal personal){
        personalRepository.save(personal);
    }
    @RequestMapping(value = "/{id}")
    public Personal read(@PathVariable String id){
        return  personalRepository.findOne(id);
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Personal personal){
        personalRepository.save(personal);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        personalRepository.delete(id);
    }

}

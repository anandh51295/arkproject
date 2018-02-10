package com.javasampleapproach.mongodbrestapi.controller;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.javasampleapproach.mongodbrestapi.model.Personal;
import com.javasampleapproach.mongodbrestapi.repository.PersonalRepository;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/admin")
public class PersonalController {
    @Autowired
    PersonalRepository personalRepository;
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@RequestBody Personal personal){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        personalRepository.save(personal);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(personal.getId()).toUri();
        return ResponseEntity.created(location).build();
    }


    @RequestMapping(value = "/{username}")
    public Personal read(@PathVariable String username){
        Personal ar;
        ar=personalRepository.findByUsername(username);
        return ar;

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

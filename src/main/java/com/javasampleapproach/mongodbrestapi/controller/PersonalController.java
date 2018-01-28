package com.javasampleapproach.mongodbrestapi.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.util.JSON;
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

//    @RequestMapping(method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public void savePerson(@RequestBody PersonWrapper wrapper) {
//        List<String> response = new ArrayList<String>();
//        for (Personal personal: wrapper.getWidget()){
//            personalRepository.save(personal);
//            //response.add("Saved Widgets: " + personal.toString());
//        }
//        for (Personal personal: wrapper.getStatus_widget()){
//            personalRepository.save(personal);
//            //response.add("Saved Widgets: " + personal.toString());
//        }
//        for (Personal personal: wrapper.getOrders()){
//            personalRepository.save(personal);
//            //response.add("Saved Widgets: " + personal.toString());
//        }
//        for (Personal personal: wrapper.getProject()){
//            personalRepository.save(personal);
//            //response.add("Saved Widgets: " + personal.toString());
//        }
//        for (Personal personal: wrapper.getLink()){
//            personalRepository.save(personal);
//            //response.add("Saved Widgets: " + personal.toString());
//        }
//        for (Personal personal: wrapper.getDescribe()){
//            personalRepository.save(personal);
//            //response.add("Saved Widgets: " + personal.toString());
//        }
//
//    }

    @RequestMapping(value = "/{id}")
    public String read(@PathVariable String id){
        String ar;
        String jsonString;
        ObjectMapper mapper = new ObjectMapper();
        ar=personalRepository.findOne(id).toString();
        try {
        jsonString = mapper.writeValueAsString(ar);
        //mapper.configure(DeserializationFeature.valueOf(), true);
        return  jsonString;
        }
        catch (JsonProcessingException e) {

            e.printStackTrace();
        }
        return  null;
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

package com.javasampleapproach.mongodbrestapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.mongodbrestapi.model.Customer;
import com.javasampleapproach.mongodbrestapi.repository.CustomerRepository;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/details")
public class UserController {

    @Autowired
    CustomerRepository customerRepository;
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void>  create(@RequestBody Customer customer){
        customerRepository.save(customer);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(customer.getId()).toUri();

        return ResponseEntity.created(location).build();
}
    @RequestMapping(value = "/{userName}")
    public Customer read(@PathVariable String userName){

        return  customerRepository.findByUserName(userName);

        //return ResponseEntity.created(location).build();
}
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
public void update(@RequestBody Customer customer){
    customerRepository.save(customer);
}
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
public void delete(@PathVariable String id){
    customerRepository.delete(id);
}

}
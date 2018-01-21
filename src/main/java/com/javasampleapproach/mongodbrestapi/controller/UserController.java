package com.javasampleapproach.mongodbrestapi.controller;

import com.javasampleapproach.mongodbrestapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.mongodbrestapi.model.Customer;
import com.javasampleapproach.mongodbrestapi.repository.CustomerRepository;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    CustomerRepository customerRepository;
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
public void create(@RequestBody Customer customer){
    customerRepository.save(customer);

}
    @RequestMapping(value = "/{id}")
public Customer read(@PathVariable String id){
    return  customerRepository.findOne(id);
}
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
public void update(@RequestBody Customer customer){
    customerRepository.save(customer);
}
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
public void delete(@PathVariable String id){
    customerRepository.delete(id);
}
    @RequestMapping(method = RequestMethod.GET,value = "/check/")
    public void read(@PathVariable String userName, @PathVariable String passWord, @RequestBody Customer customer){

        //String usr = userName;
        String usr = customer.getUserName();
        String pwd=customer.getPassWord();
        //String pwd=passWord;
        if(customerRepository.findOne(usr)!=null&&customerRepository.findOne(pwd)!=null){
            System.out.println("user found");
        }
        else{
            System.out.println("no users found");
        }
    }
}
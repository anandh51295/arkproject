package com.javasampleapproach.mongodbrestapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javasampleapproach.mongodbrestapi.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends MongoRepository<Customer, String> {
	List<Customer> findByPassWord(@Param("password") String name);
	List<Customer> findByUserName(@Param("username") String name);
	List<Customer> findByEmail(@Param("email") String name);

}
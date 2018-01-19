package com.javasampleapproach.mongodbrestapi.repository;
import java.util.List;

import com.javasampleapproach.mongodbrestapi.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javasampleapproach.mongodbrestapi.model.User;
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByEmail(@Param("email") String name);
    List<User> findByUsername(@Param("username") String name);
    List<User> findByPassword(@Param("password") String name);



}

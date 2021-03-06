package com.javasampleapproach.mongodbrestapi.repository;
import java.util.List;

import com.javasampleapproach.mongodbrestapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javasampleapproach.mongodbrestapi.model.User;
@RepositoryRestResource(collectionResourceRel = "crawled", path = "crawled")
public interface UserRepository extends MongoRepository<User, String> {
   // @Query("db.user.findOne({'username':$ark,'password':$spy})")
    List<User> findByUsername(@Param("username") String name);
}

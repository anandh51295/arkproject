package com.javasampleapproach.mongodbrestapi.repository;

import java.util.ArrayList;
import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javasampleapproach.mongodbrestapi.model.Personal;

@RepositoryRestResource(collectionResourceRel = "personal", path = "personal")
public interface PersonalRepository extends MongoRepository<Personal, String> {
    Personal findByUsername(@Param("username") String name);
    Personal findByEmail(@Param("email") String name);

//    @Query("{update({},{$pull:{project:{'Project': ?0}}},{multi:true})}")
//    //Personal findByProject(@Param("project")String name);

}

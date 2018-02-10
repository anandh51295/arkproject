package com.javasampleapproach.mongodbrestapi.repository;

import com.javasampleapproach.mongodbrestapi.model.Projectdetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "projectdetails", path = "projectdetails")
public interface ProjectdetailsRepository extends MongoRepository<Projectdetails, String> {
    Projectdetails findByProject(@Param("project") String name);
}

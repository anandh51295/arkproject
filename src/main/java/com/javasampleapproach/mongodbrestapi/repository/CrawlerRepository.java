package com.javasampleapproach.mongodbrestapi.repository;


import com.javasampleapproach.mongodbrestapi.model.Crawler;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "crawler", path = "crawler")
public interface CrawlerRepository extends MongoRepository<Crawler, String> {


}

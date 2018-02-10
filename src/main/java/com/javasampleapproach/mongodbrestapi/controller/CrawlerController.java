package com.javasampleapproach.mongodbrestapi.controller;



import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import com.javasampleapproach.mongodbrestapi.model.Crawler;
import com.javasampleapproach.mongodbrestapi.repository.CrawlerRepository;

@RestController
@RequestMapping("/crawl")
public class CrawlerController {

    @Autowired
    CrawlerRepository crawlerRepository;

    @RequestMapping(value = "/{id}")
    public Crawler read(@PathVariable String id){
        return crawlerRepository.findOne(id);


    }
}

package com.javasampleapproach.mongodbrestapi.controller;


import com.javasampleapproach.mongodbrestapi.model.Projectdetails;
import com.javasampleapproach.mongodbrestapi.repository.ProjectdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectdetailsRepository projectdetailsRepository;

    @RequestMapping(value = "/{project}")
    public Projectdetails read(@PathVariable String project){
        return projectdetailsRepository.findByProject(project);


    }
}

package com.javasampleapproach.mongodbrestapi.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;

public class Projectdetails implements Serializable {
    @Id
    private String id;
    private String project;
    private ArrayList links;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public ArrayList getLinks() {
        return links;
    }

    public void setLinks(ArrayList links) {
        this.links = links;
    }
}

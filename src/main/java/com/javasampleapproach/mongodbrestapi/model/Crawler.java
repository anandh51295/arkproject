package com.javasampleapproach.mongodbrestapi.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;

public class Crawler implements Serializable {

    @Id
    private String    id;
//    private ArrayList    url;
//    private ArrayList    title  ;
//    private String    projecturl ;
    private ArrayList project ;
    private ArrayList value ;
    private ArrayList meta ;
    private ArrayList div ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList getProject() {
        return project;
    }

    public void setProject(ArrayList project) {
        this.project = project;
    }

    public ArrayList getValue() {
        return value;
    }

    public void setValue(ArrayList value) {
        this.value = value;
    }

    public ArrayList getMeta() {
        return meta;
    }

    public void setMeta(ArrayList meta) {
        this.meta = meta;
    }

    public ArrayList getDiv() {
        return div;
    }

    public void setDiv(ArrayList div) {
        this.div = div;
    }
}

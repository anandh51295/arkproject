package com.javasampleapproach.mongodbrestapi.model;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
public class Personal implements Serializable{


    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private String role;

    private String activeProject;
    private String status;
    private String defectnotification;
    private String page_status;




    private ArrayList widget;
    private String icons;


    private String question;
    private String answer;
    private ArrayList project;






//    @Override
//    public String toString() {
//        return "personal:[username="+username+",password="+password+",email="+email+",role="+role+",activeProject="+activeProject+",status="+status+",defectnotification="+defectnotification+",page_status="+page_status+",icons="+icons+",question="+question+",answer="+answer+",project [project="+project+"],url [url="+url+"],description [description="+description+"],widget_name [Widget_name="+Widget_name+"],widget_status [widget_status="+widget_status+"],order [order="+order+"]]";
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getActiveProject() {
        return activeProject;
    }

    public void setActiveProject(String activeProject) {
        this.activeProject = activeProject;
    }



    public String getIcons() {
        return icons;
    }

    public void setIcons(String icons) {
        this.icons = icons;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getPage_status() {
        return page_status;
    }

    public void setPage_status(String page_status) {
        this.page_status = page_status;
    }





    public ArrayList getProject() {
        return project;
    }

    public void setProject(ArrayList project) {
        this.project = project;
    }

    public String getDefectnotification() {
        return defectnotification;
    }

    public void setDefectnotification(String defectnotification) {
        this.defectnotification = defectnotification;
    }


    public ArrayList getWidget() {
        return widget;
    }

    public void setWidget(ArrayList widget) {
        this.widget = widget;
    }


}

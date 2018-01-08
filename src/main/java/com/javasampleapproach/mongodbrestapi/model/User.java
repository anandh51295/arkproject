package com.javasampleapproach.mongodbrestapi.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String email;
    private String password;
    @Override
    public String toString() {
        return String.format("Users[id=%s, email='%s', password='%s']", id, email, password);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

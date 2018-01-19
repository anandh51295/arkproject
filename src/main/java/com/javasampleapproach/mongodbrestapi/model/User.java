package com.javasampleapproach.mongodbrestapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import java.util.concurrent.atomic.AtomicLong;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long id;
    private String username;
    private String email;
    private String password;

    private static AtomicLong COUNTER = new AtomicLong(0L);

    @PersistenceConstructor
    public User() {
        this.id = COUNTER.incrementAndGet();
    }
    @Override
    public String toString() {
        return String.format("Users[id=%s, email='%s', password='%s']", id, email, password);
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

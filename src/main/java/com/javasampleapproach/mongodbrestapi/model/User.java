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
    private String date;
    private String time;
    private String url;


    private static AtomicLong COUNTER = new AtomicLong(0L);

    @PersistenceConstructor
    public User() {
        this.id = COUNTER.incrementAndGet();
    }

    @Override
    public String toString() {
        return String.format("Crawl[id=%s, username='%s',url='%s', date='%s, time='%s'']", id, username, url, date,time);
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

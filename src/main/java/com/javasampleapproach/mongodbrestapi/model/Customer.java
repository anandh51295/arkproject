package com.javasampleapproach.mongodbrestapi.model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

 
public class Customer implements Serializable {
 
	private static final long serialVersionUID = 1L;

	@Id
    private Long id;
 
    private String firstName;
 
    private String lastName;
 
    private static AtomicLong COUNTER = new AtomicLong(0L);
    
    @PersistenceConstructor
    public Customer() {
        this.id = COUNTER.incrementAndGet();
    }
 
    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

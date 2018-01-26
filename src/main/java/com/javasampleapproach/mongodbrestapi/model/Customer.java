package com.javasampleapproach.mongodbrestapi.model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

 
public class Customer implements Serializable {
 
	private static final long serialVersionUID = 1L;

	@Id
    private String id;
 
    private String userName;
 
    private String passWord;
    private String eMail;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    @Override
    public String toString() {
        return String.format("Customer[id='%s', username='%s', password='%s', email='%s']", id, userName, passWord,eMail);
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}

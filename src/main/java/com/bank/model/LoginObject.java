package com.bank.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="login")
public class LoginObject {
@Id
@GeneratedValue(generator="increment")
@GenericGenerator(name="increment", strategy="increment")
@Column(name="id")
int id;	
@Column(name="username")
String username;
@Column(name="password")
String password;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public LoginObject() 
{ }	

public LoginObject(int id,String username, String password) {
	this.id = id;
	this.username = username;
	this.password = password;
}

}

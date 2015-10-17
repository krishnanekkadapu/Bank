package com.bank.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="account")
public class CustomerObject {
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy="increment")
	@Column(name="id")
	int id;	
	@Column(name="name")
	String name;
	@Column(name="dob")
	Date dob;
	@Column(name="address")
	String address;
	@Column(name="emailid")
	String email;
	@Column(name="typeofacc")
	String typeofacc;
	@Column(name="accountno")
	String accnumber;
	
	public String getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}
	public CustomerObject()
	{
		
	}
	public CustomerObject(int id, String name, Date dob, String address,
			String email, String typeofacc,String accnumber) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.typeofacc = typeofacc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTypeofacc() {
		return typeofacc;
	}
	public void setTypeofacc(String typeofacc) {
		this.typeofacc = typeofacc;
	}

}

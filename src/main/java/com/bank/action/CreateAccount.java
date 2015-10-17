package com.bank.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.bank.dao.DatabaseSession;
import com.bank.model.CustomerObject;
import com.opensymphony.xwork2.ActionContext;

public class CreateAccount {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private Date dob;
	private String address;
	private String email;
	private String typeofacc;
	private String accnumber;
	List<String> account;
	DatabaseSession store = new DatabaseSession();
	
	public String execute()
	{
		account = new ArrayList<String>();
		account.add("Checkings");
		account.add("Savings");
		Map<String,Object> list = ActionContext.getContext().getApplication();
		list.put("listvalues", account);
		System.out.println("hello");
		return "success";
	}
	
	public String accountdetails()
	{
		CustomerObject customer = new CustomerObject(getId(),getName(),getDob(),getAddress(),getEmail(),getTypeofacc(),getAccnumber());
		store.saveDetails(customer);
		return "success";
	}
	
	public List<String> getAccount() {
		return account;
	}

	public void setAccount(List<String> account) {
		this.account = account;
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
	public String getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}

}

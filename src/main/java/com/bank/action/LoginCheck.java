package com.bank.action;

import java.util.List;

import com.bank.dao.DatabaseSession;
import com.bank.model.LoginObject;
import com.opensymphony.xwork2.ActionSupport;

public class LoginCheck extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username;
	private  String password;
	DatabaseSession database = new DatabaseSession();
	public String execute()
	{
		if(username!=null)
		{
		List<LoginObject> users = database.getDetails();
		for(LoginObject user:users)
		{
			if(username.equals(user.getUsername()) && password.equals(user.getPassword()))
			{
				return "success";
			}
		}
		}
		addActionMessage("invalid user");
		return "failure";
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

}

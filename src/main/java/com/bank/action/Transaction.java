package com.bank.action;

public class Transaction {

	private String accountbalance;
	
	public Transaction()
	{
		
	}
	public Transaction(String accountbalance) {
		this.accountbalance = accountbalance;
		
	}
	public String getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(String accountbalance) {
		this.accountbalance = accountbalance;
	}
	
}

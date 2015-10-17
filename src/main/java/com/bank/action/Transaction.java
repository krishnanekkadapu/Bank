package com.bank.action;

public class Transaction {

	private String accountbalance;
	private String balance;
	
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
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

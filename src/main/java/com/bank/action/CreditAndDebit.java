package com.bank.action;

public class CreditAndDebit {

	private String accountno;
	private String amount;
	
	
	public String execute()
	{
		return "success";
	}
	
	public String credit()
	{
		
		return "success";
	}
	public String debit()
	{
		return "success";
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}

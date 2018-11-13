package com.cg.pwa.dto;

public class Customer {

	private Long mobileNum;
	private String custName;
	private String custEmail;
	private double accBalance;
	private String password;
	

	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [mobileNum=" + mobileNum + ", custName=" + custName
				+ ", custEmail=" + custEmail + ", accBalance=" + accBalance
				+ "]";
	}

	public Customer(Long mobileNum, String custName, String custEmail,
			double accBalance) {
		super();
		this.mobileNum = mobileNum;
		this.custName = custName;
		this.custEmail = custEmail;
		this.accBalance = accBalance;
	}

	public Long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



}

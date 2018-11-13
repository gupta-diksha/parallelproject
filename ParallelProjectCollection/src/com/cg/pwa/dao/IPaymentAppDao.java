package com.cg.pwa.dao;

import java.time.LocalDate;
import java.util.Map;

import com.cg.pwa.dto.Customer;

public interface IPaymentAppDao {
	
	public void createAccount(Customer cust);
	public double showBalance(Long mobile);
	public double deposit(Long mobile,double depamnt);
	public double withdraw(Long mobile,double wdamnt);
	public double fundsTranfer(Long mobile,Long mobileReceiver,double transferAmnt);
	public Map<String,LocalDate> printTransactions();
	

}

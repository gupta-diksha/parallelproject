package com.cg.pwa.service;

import java.time.LocalDate;
import java.util.Map;

import com.cg.pwa.dto.Customer;
import com.cg.pwa.exception.PaymentAppException;

public interface IPaymentAppService {
	public void createAccount(Customer cust);
	public double showBalance(Long mobile);
	public double deposit(Long mobile,double depamnt);
	public double withdraw(Long mobile,double wdamnt);
	public double fundsTranfer(Long mobile,Long mobileReceiver,double transferAmnt);
	public Map<String,LocalDate> printTransactions();
	public boolean validateUser(long uname, String password)throws PaymentAppException;
	public boolean validateMobile(long mobnum)throws PaymentAppException;
	public boolean validateName(String name)throws PaymentAppException;
	public boolean validateMail(String mail)throws PaymentAppException;
	public boolean validateAmount(double wdAmnt)throws PaymentAppException;
	public boolean validateBalanceLimit(double wdAmnt)throws PaymentAppException;

}
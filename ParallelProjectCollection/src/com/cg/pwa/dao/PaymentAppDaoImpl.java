package com.cg.pwa.dao;

import java.time.LocalDate;
import java.util.Map;

import com.cg.pwa.dto.Customer;

public class PaymentAppDaoImpl  implements IPaymentAppDao{

	@Override
	public void createAccount(Customer cust) {
		
	}

	@Override
	public double showBalance(Long mobile) {
		
		return 0;
	}

	@Override
	public double deposit(Long mobile, double depamnt) {
		
		return 0;
	}

	@Override
	public double withdraw(Long mobile, double wdamnt) {
		
		return 0;
	}

	@Override
	public double fundsTranfer(Long mobile,Long mobileReceiver, double transferAmnt) {
		
		return 0;
	}

	@Override
	public Map<String, LocalDate> printTransactions() {
		
		return null;
	}

}

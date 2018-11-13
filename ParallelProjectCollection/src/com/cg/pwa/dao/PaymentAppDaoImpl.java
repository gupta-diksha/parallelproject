package com.cg.pwa.dao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;


import com.cg.pwa.util.CollectionUtil;
import com.cg.pwa.dto.Customer;
import com.cg.pwa.exception.PaymentAppException;

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

	@Override
	public HashSet<Customer> getAll() {
		
		return CollectionUtil.getAllCustomers();
		
	}

}

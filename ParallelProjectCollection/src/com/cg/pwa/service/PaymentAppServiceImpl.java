package com.cg.pwa.service;

import java.time.LocalDate;
import java.util.Map;
import java.util.regex.Pattern;

import com.cg.pwa.exception.PaymentAppException;
import com.cg.pwa.dao.IPaymentAppDao;
import com.cg.pwa.dao.PaymentAppDaoImpl;
import com.cg.pwa.dto.Customer;
//import com.cg.pwa.exception.PaymentAppException;

public class PaymentAppServiceImpl implements IPaymentAppService {

	IPaymentAppDao pwaDao=null;
	
	
	public PaymentAppServiceImpl() {
		pwaDao=new PaymentAppDaoImpl();
	}


	@Override
	public boolean validateUser(long uname, String password)throws PaymentAppException {
		
		return false;
	}
	
	
	@Override
	public void createAccount(Customer cust) {
		
		pwaDao.createAccount(cust);
	}

	@Override
	public double showBalance(Long mobile) {
		
		return pwaDao.showBalance(mobile);
	}

	@Override
	public double deposit(Long mobile, double depamnt) {
		
		return pwaDao.deposit(mobile, depamnt);
	}

	@Override
	public double withdraw(Long mobile, double wdamnt) {
		
		return pwaDao.withdraw(mobile, wdamnt);
	}

	@Override
	public double fundsTranfer(Long mobile,Long mobileReceiver, double transferAmnt) {
		
		return pwaDao.fundsTranfer(mobile, mobileReceiver, transferAmnt);
	}

	@Override
	public Map<String, LocalDate> printTransactions() {
		
		return null;
	}


	@Override
	public boolean validateMobile(long mobnum) throws PaymentAppException{
		
		
		return false;
	}


	@Override
	public boolean validateName(String name) throws PaymentAppException
	{
		
		String namePattern= "[A-Z][a-z]+";
		if (Pattern.matches(namePattern,name))
		{
			return true;
		}
		else {
			throw new PaymentAppException("Invalid input"+"Only characters are allowed and should start with capital letter for eg Diksha!");
		}
		
		
	}


	@Override
	public boolean validateMail(String mail)throws PaymentAppException {
		
		return false;
	}


	@Override
	public boolean validateAmount(double amnt)throws PaymentAppException {
		
		if(amnt>0)
			return true;
		else
			throw new PaymentAppException("Invalid amount!! Cannot be negative!");
	}


	@Override
	public boolean validateBalanceLimit(double wdAmnt)throws PaymentAppException {
		
		return false;
	}

	

	
}

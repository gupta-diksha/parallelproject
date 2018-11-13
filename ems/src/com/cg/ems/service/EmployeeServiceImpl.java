package com.cg.ems.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

import com.cg.ems.dao.EmpDaoImpl;
import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.util.CollectionUtil;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao empDao = null;

	public EmployeeServiceImpl() {
		
		empDao = new EmpDaoImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addEmployee(Employee ee) throws EmployeeException {
		// TODO Auto-generated method stub
		return empDao.addEmployee(ee);
	}

	@Override
	public HashSet<Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		return empDao.fetchAllEmp();
	}

	@Override
	public Employee getEmpById(String empId) {
		// TODO Auto-generated method stub
		return empDao.getEmpById(empId);
	}

	@Override
	public HashSet<Employee> searchEmpByName(String name) {
		// TODO Auto-generated method stub
		
		return empDao.searchEmpByName(name);
		
	}

	@Override
	public String deleteEmp(String empId) {
		// TODO Auto-generated method stub
		return empDao.deleteEmp(empId);
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		return empDao.updateEmp(empId, newName, newSal);
	}

	@Override
	public boolean validateDigit(String num) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String digitPattern= "[0-9]+";
		if (Pattern.matches(digitPattern,num))
		{
			return true;
		}
		else {
			throw new EmployeeException("Invalid input"+"Only digits are allowed for example 1234567890!!");
		}
		
		
	}

	@Override
	public boolean ValidateName(String name) throws EmployeeException {
		// TODO Auto-generated method stub
		String namePattern= "[A-Z][a-z]+";
		if (Pattern.matches(namePattern,name))
		{
			return true;
		}
		else {
			throw new EmployeeException("Invalid input"+"Only characters are allowed and should start with capital letter for eg Diksha!");
		}
		
		//return false;
	}

	@Override
	public LocalDate convertFromStringtoLocalDate(String dtstr) {
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(dtstr,myFormat);
		return date;
	}

	
	public Period experienceOfEmp(int id) {
		LocalDate today = LocalDate.now();
		Period p =null;
		HashSet<Employee> eset = CollectionUtil.getAllEmp();
		Iterator<Employee> it = eset.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			if(id==e.getEmpId())
				p= Period.between(e.getEmpDOJ(), today);
		}
		return p;
	}
	
	

}

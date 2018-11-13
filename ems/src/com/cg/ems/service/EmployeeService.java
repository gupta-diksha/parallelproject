package com.cg.ems.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public interface EmployeeService {
	
	public int addEmployee(Employee ee)throws EmployeeException;
	public HashSet<Employee> fetchAllEmp();
	public Employee getEmpById(String empId);
	public HashSet<Employee> searchEmpByName(String name);
	public String deleteEmp(String empId);
	public Employee updateEmp(int empId, String newName,float newSal);
	//Validation of data is done in service layer so it is to be done here
	public boolean validateDigit(String num) throws EmployeeException;
	public boolean ValidateName(String name)throws EmployeeException;
	public LocalDate convertFromStringtoLocalDate(String dtstr);
	public Period experienceOfEmp(int id);
}


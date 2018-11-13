package com.cg.ems.dto;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private String empName;
	private float empSal;
	private LocalDate empDOJ;
	
	public int getEmpId() {
		return empId;
	}
	public Employee() {
		
	}
	public Employee(int empId, String empName, float empSal,LocalDate empDOJStr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDOJ = empDOJStr;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal +", empDOJ="+empDOJ+ "]";
	}
	
	@Override
	public boolean equals(Object obj){
		
		Employee emp = (Employee)obj;
		if(emp.empId == this.empId) {
			return true;
		}
		else 
			return false;
	}
	public boolean equals(String s){
		
		
		if((this.empName).equals(s)) {
			return true;
		}
		else 
			return false;
	}
	@Override
	public int hashCode() {
		return empId;
	}
	@Override
	public int compareTo(Employee emp)
	{
		if(emp.empId<this.empId)
			return -1;
		else if(emp.empId == this.empId)
			return 0;
		else
			return 1;
	}
	public LocalDate getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(LocalDate empDOJ) {
		this.empDOJ = empDOJ;
	}

}

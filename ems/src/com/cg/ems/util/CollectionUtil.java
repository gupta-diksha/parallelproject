package com.cg.ems.util;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;

import com.cg.ems.dto.Employee;

public class CollectionUtil {
	
	private static HashSet<Employee> empset = new HashSet<Employee>();
	static{
		 empset.add(new Employee(1221,"Vaishali S",5000.0f,LocalDate.of(2014, Month.MARCH, 04)));
		 empset.add(new Employee(1222,"Diksha",8000.0f,LocalDate.of(2015, Month.APRIL, 14)));
		 empset.add(new Employee(1232,"Nancy",5500.0f,LocalDate.of(2017, Month.SEPTEMBER, 30)));
		 empset.add(new Employee(1258,"Armaan",15000.0f,LocalDate.of(2016, Month.JUNE, 11)));
		 empset.add(new Employee(1289,"Neha",75000.0f,LocalDate.of(2014, Month.JULY, 12)));
		 empset.add(new Employee(1275,"Manisha",52000.0f,LocalDate.of(2018, Month.MAY, 31)));
	}
	 public static void addEmp(Employee emp){
		 
		 empset.add(emp);
	 }
	 public static HashSet<Employee> getAllEmp(){
		 
		 return empset;
	 }
	 public static void delEmp(Employee e){
		 empset.remove(e);
	 }
	 
	
	//public static void main(String args)

}

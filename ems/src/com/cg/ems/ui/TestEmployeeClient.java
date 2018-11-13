package com.cg.ems.ui;

import java.util.HashSet;
import java.time.Period;
import java.util.Iterator;
import java.util.Scanner;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmployeeClient {
	
	static Scanner sc = null;
	static EmployeeService empSer= null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 sc = new Scanner(System.in);
		 empSer= new EmployeeServiceImpl();
		 int choice=0;
		 
		 while(true){
			 
			 System.out.println("What do you want to do?");
			 System.out.println("1:Add Emp \t 2:Fetch All Emp \n");
			 System.out.println("3:Delete Emp \t 4: Search Emp by id \n");
			 System.out.println("5:Search by name\t 6: Update \n");
			 System.out.println("7:Displaying experience of employee \t 8:Exit\n");
			 System.out.println("Enter your choice:");
			 choice= sc.nextInt();
			 switch(choice)
			 {
			 case 1 : addEmp(); break;
			 case 2 : showEmpinfo();break;
			 case 3 : delete();break;
			 case 4 : searchEmpById();break;
			 case 5 : searchEmpByName();break; 
			 case 6 : update();break;
			 case 7 : empExperience();
			 default: System.exit(0);
			 
			 }
		}
}

	private static void empExperience() {
		System.out.println("Enter the employee id:");
		int empID= sc.nextInt();
		Period p1 = empSer.experienceOfEmp(empID);
		System.out.println("Experience of employee:"+p1.getYears()+" years "+p1.getMonths()+" months "+p1.getDays()+" days");
		
		
	}

	private static void update() {
		
		System.out.println("Enter the empid against which you want to update:");
		String eid = sc.next();
		System.out.println("Enter the new name:");
		String nName= sc.next();
		System.out.println("Enter the new salary:");
		Float nSal=  sc.nextFloat();
		Employee obj = empSer.updateEmp(Integer.parseInt(eid), nName, nSal);
		if(obj!=null)
			System.out.println(eid+"\tSuccessfully updated!");
		else
			System.out.println("Cannot find this employee id!Try again!");
		
		
	}

	private static void delete() {
		
		System.out.println("Enter the employee id to be deleted:");
		String eid= sc.next();
		String s = empSer.deleteEmp(eid);
		if(s==eid)
			System.out.println(eid+" has been removed successfully!");
		else
			System.out.println("Not found");
		
	}

	private static void searchEmpById() {
		
		System.out.println("Enter the employee id to be searched:");
		String eid= sc.next();
		Employee e = empSer.getEmpById(eid);
		if(e!=null)
			System.out.println(eid+"  Found "+e);
		else
			System.out.println("Not found");
		
	}

	private static void searchEmpByName() {
		
		System.out.println("Enter the name to be searched:");
		String searchName= sc.next();
		HashSet<Employee> eset = empSer.searchEmpByName(searchName);
		System.out.println(eset);
		
	}

	private static void showEmpinfo() {
		
		HashSet<Employee>  empSet = empSer.fetchAllEmp();
		Iterator<Employee> it = empSet.iterator();
		System.out.println("************************************");
		System.out.println("EMPID\t\tEMPNAME\t\tEMPSALARY\t\tEMPDOJ");
		while(it.hasNext()){
			Employee ee=it.next();
			System.out.println(ee.getEmpId()+"\t\t"+ee.getEmpName()+"\t\t"+ee.getEmpSal()+"\t\t"+ee.getEmpDOJ());
		}
		System.out.println("************************************");
	}	
		
	

	private static void addEmp() {
		
		System.out.println("Enter Emp id:");
		String eid = sc.next();
		try{
			if(empSer.validateDigit(eid)){
				System.out.println("Enter Emp name:");
				String nm =  sc.next();
				if(empSer.ValidateName(nm)) {
					System.out.println("Enter Salary:");
					float sal = sc.nextFloat();
					System.out.println("Enter DOJ(dd-mm-yyyy)");
					String empDOJStr= sc.next();
					Employee ee = new Employee(Integer.parseInt(eid),nm,sal,empSer.convertFromStringtoLocalDate(empDOJStr));
					System.out.println(eid);
					int empId= empSer.addEmployee(ee);
					System.out.println(empId+" Added successfully!");
				}			
			}
		}
		catch(EmployeeException e){
			e.printStackTrace();
		}
	}

}

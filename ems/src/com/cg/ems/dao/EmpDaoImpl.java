package com.cg.ems.dao;

import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.util.CollectionUtil;

public class EmpDaoImpl implements EmployeeDao {
	
	

	@Override
	public int addEmployee(Employee ee) throws EmployeeException {
		CollectionUtil.addEmp(ee);
		return ee.getEmpId();
		
	}

	@Override
	public HashSet<Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		return CollectionUtil.getAllEmp();
		
	}

	@Override
	public Employee getEmpById(String empId) {
		// TODO Auto-generated method stub
		HashSet<Employee> eset = CollectionUtil.getAllEmp();
		Iterator<Employee> it = eset.iterator();
		while(it.hasNext()){
			Employee ee =it.next();
			if((ee.getEmpId())==(Integer.parseInt(empId))){
				return ee;
			}
		}
		return null;
		}				
		
		
	

	@Override
	public HashSet<Employee> searchEmpByName(String name) {
		// TODO Auto-generated method stub
		HashSet<Employee> eset = CollectionUtil.getAllEmp();
		HashSet<Employee> newset = new HashSet<Employee>();
		Iterator<Employee> it = eset.iterator();
		while(it.hasNext()){
			Employee ee =it.next();
			if(ee.getEmpName().equals(name)) {
				
				newset.add(ee);
			}
			}
			return newset;
		
	}

	@Override
	public String deleteEmp(String empId) {
		// TODO Auto-generated method stub
		HashSet<Employee> eset = CollectionUtil.getAllEmp();
		Iterator<Employee> it = eset.iterator();
		boolean flag= false;
		while(it.hasNext()){
			
			Employee e1 = it.next();
			int i=Integer.parseInt(empId);
			if(e1.getEmpId()==i){
				
				flag =true;
				it.remove();
				CollectionUtil.delEmp(e1);
				
			}
		}
		if(flag)
			return empId;
		else 
			return null;
			
		
		
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		
		HashSet<Employee> eset = CollectionUtil.getAllEmp();
		Iterator<Employee> it = eset.iterator();
		Employee e1 = null;
		while(it.hasNext()){
			 e1 = it.next();
			if(e1.getEmpId()==empId){
				
					e1.setEmpName(newName);
					e1.setEmpSal(newSal);		
			}
				
		}		
		return e1;
	}

	
	
	
}

package com.wipro.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpoyeeDB extends Employee{
	public EmpoyeeDB(int empId, String empName, String email, String gender, float salary) {
		super(empId, empName, email, gender, salary);
	}
	ArrayList<Employee> a=new ArrayList<Employee>();
	boolean addEmplyee(Employee e) {
		Employee e1=new Employee(123,"GGJVH","sdfghg@gmail.com","M",2323343);
		a.add(e1);
		return true;
	}
	boolean deleteEmployee(int empId) {
		Iterator<Employee> i=a.iterator();
		
		return true;
	}
	public static void main(String[] args) {
		
	}
}

class Employee{
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	public Employee(int empId, String empName, String email, String gender, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	void GetEmployeeDetails() {
		System.out.println(empId+" "+empName+" "+email+" "+gender+" "+salary);
	}
}
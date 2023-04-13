package org.emp;

public class Employee {
	private void employeeName() {
		System.out.println("employeeName");
	}
	private void employeeId() {
		System.out.println("employeId");
	}
	private void employeeDod() {
		System.out.println("employeeDod");
	}
	private void employeePhone() {
		System.out.println("employeePhone");
	}
	private void employeeEmail() {
		System.out.println("employeeEmail");
	} 
	
public static void main(String[] args) {
		Employee r= new Employee();
		r.employeeName();
		r.employeeId();
		r.employeeDod();
		r.employeePhone();
		r.employeeEmail();
		
		
	}

}

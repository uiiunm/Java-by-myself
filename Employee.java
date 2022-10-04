package com.ruby.java.bymyself;

public class Employee extends Person {
	private String dept;

	public Employee(String name, int age, String subject, String dept) {
		super(name, age, subject);
		this.dept = dept;
		System.out.println("Employee(name, age, subject, dept) 생성자 실행!");
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return super.toString() + ":" + dept;
	}

}
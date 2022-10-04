package com.ruby.java.bymyself;

class Person {
	public String name;
	public int age;
	public String subject;

	public Person(String name, int age, String subject) {
		System.out.println("Person 생성자 실행!");
		this.name = name; //
		this.age = age; //
		this.subject = subject; //
	}

	public void person() {
		name = "";
		age = 0;
		subject = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String toString() {
		return name + ":" + age + ":" + subject;
	}

}

//class Employee extends Person {
//	private String dept;
//
//	public Employee(String name, int age, String subject, String dept) {
//		super(name, age, subject);
//		this.dept = dept;
//		System.out.println("Employee(name, age, subject, dept) 생성자 실행!");
//	}
//
//	public String getDept() {
//		return dept;
//	}
//
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
//
//	public String toString() {
//		return super.toString() + ":" + dept;
//	}
//
//}
//
//class Professor extends Person {
//	private String gender;
//
//	public Professor(String name, int age, String subject, String gender) {
//		super(name, age, subject);
//		this.gender = gender;
//		System.out.println("Professor(name, age, subject, gender) 생성자 실행!");
//
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String toString() {
//		return super.toString() + ":" + gender;
//	}
//
//}
//
//class Student extends Person {
//	private String major;
//
//	public Student(String name, int age, String subject, String major) {
//		super(name, age, subject);
//		this.major = major;
//		System.out.println("Student(name, age, subject, major) 생성자 실행!");
//	}
//
//	public String getMajor() {
//		return major;
//	}
//
//	public void setMajor(String major) {
//		this.major = major;
//	}
//
//	public String toString() {
//		return super.toString() + ":" + major;
//	}
//
//}
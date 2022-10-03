package assignment;

public class Student extends Person {
	private String major;

	public Student(String name, int age, String subject, String major) {
		super();
		this.major = major;
		System.out.println("Student(name, age, subject, major) 생성자 실행!");
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return super.toString() + ":" + major;
	}

}
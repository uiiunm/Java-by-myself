package assignment;

public class Professor extends Person {
	private String gender;

	public Professor(String name, int age, String subject, String gender) {
		super();
		this.gender = gender;
		System.out.println("Professor(name, age, subject, gender) 생성자 실행!");

	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {
		return super.toString() + ":" + gender;
	}

}
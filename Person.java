package assignment;

class Person {
	public String name;
	public int age;
	public String subject;

	public Person() {
		System.out.println("Person 생성자 실행!");
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

	public String toString() {
		return name + ":" + age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
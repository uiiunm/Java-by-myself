package com.ruby.java.bymyself;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		list.add(new Employee("오정임", 47, "수학", "입학처"));

		list.add(new Professor("김푸름", 52, "과학", "여성"));

		list.add(new Student("김유빈", 20, "국어", "국문학"));

		for (Person t : list) {

			t.person();
		}

	}

}

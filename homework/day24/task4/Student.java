package com.xebia.day24.task4;

public class Student {

	int rollno;
	String name;
	String city;

	public Student(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}

	public String representation(Student student) {
		return student.toString();
	}

}

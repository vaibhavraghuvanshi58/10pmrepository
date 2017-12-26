package org.test;

public class Student implements Comparable<Student> {
	int age;
	String name;
	int rollnumber;

	Student(String name, int rollnumber, int age){
		this.name = name;
		this.rollnumber = rollnumber;
		this.age = age;	
	}

	@Override
	public int compareTo(Student o) {
		int def =  this.name.compareTo(o.name) ;
		return def;
	}
	
	
}

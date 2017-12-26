package org.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentSetDemo {
	public static void main(String[] args) {
		Set<Student> stus = new HashSet<Student>();
		//Student ramu = ;
		stus.add(new Student("Vaibhav", 1, 28));
		stus.add(new Student("Dristi", 4, 20));
		stus.add(new Student("Sambha", 4, 29));
		stus.add(new Student("Krishna", 2, 25));
		stus.add(new Student("Anil", 6, 18));
		stus.add(new Student("Shubham", 5, 24));
		stus.add(new Student("Mahesh", 7, 21));
		
		for(Student st : stus){
			System.out.println(st.name + " -> " + st.rollnumber);
		}
	}
}

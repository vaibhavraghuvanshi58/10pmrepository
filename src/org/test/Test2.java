package org.test;

public class Test2 {
	int i = 10;
	int sum = 0;
	
	public static void main(String[] args) {
		Test2 hj= sum(10,20);
		System.out.println(hj.sum);
	}
	
	public static Test2 sum(int i , int j){
		
		Test2 test = new Test2();
		test.sum = i + j;
		return test;
	}
	
	
	
	
}

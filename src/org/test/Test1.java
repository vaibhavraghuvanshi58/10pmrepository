package org.test;

public class Test1 {
	
	int i = 10; // intance variable
	static int j = 10;  // static varibale
	
	public void increase(){
		i++;
		j++;
	}
	
	public void showValue(){
		System.out.println("i->"+i);
		System.out.println("j->"+j);
	}
	
	public static void main(String[] args) {
		
		
		Test1 test1 = new Test1();
		test1.increase();
		test1.showValue();
		
		Test1 test2 = new Test1();
		test2.increase();
		test2.showValue();
	}
	
}

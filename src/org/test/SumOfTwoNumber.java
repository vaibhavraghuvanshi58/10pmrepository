package org.test;

import java.util.Scanner;

public class SumOfTwoNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("First number");
	int x = scan.nextInt();
	System.out.println("Second number");
	int y = scan.nextInt();
	int z = x+y;
	System.out.println(x + " + " + y + " = " + z);
	scan.close();
}
}

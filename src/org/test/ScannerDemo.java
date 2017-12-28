package org.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		
//		input = input +1;

		// chnage string into datatypes
		/// eveyr data type has its own class (wrapper classes)
		
		// datatype -----> Wrapper class (AutoBoxing)
		// 
		
		Integer jk = 34;
		int kl = jk; // autoboxing
		jk = kl; // unboxing
		
		
		int incoming= Integer.parseInt(input);
		incoming = incoming+1;
	
		long lg = Long.parseLong(input);
		boolean bool = Boolean.parseBoolean(""); 
		
		// string into integer
		// integre into string
		
		int p1 = 34;
		String hj = String.valueOf(p1);
		
		System.out.println("you entered " + incoming);
		
		
		
		
		scan.close();
	}
}

package org.test;

public class StringBufferBuilderDemo {
public static void main(String[] args) {
	// strinng buffer
	String str1 = "Java";
	str1 = "Java1";
	System.out.println(str1);
	
	// one object
	StringBuffer strbuf = new StringBuffer("Java");
	strbuf.append("1");
	System.out.println(strbuf.toString());
	
	
	StringBuilder strbul = new StringBuilder("Java");
	strbul.append("1");
	System.out.println(strbul);
}
}

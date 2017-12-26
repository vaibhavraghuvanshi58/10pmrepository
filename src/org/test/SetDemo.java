package org.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
	Set<String> jk = new TreeSet<String>();
	jk.add("test1");
	jk.add("2test");
	jk.add("test3");
	jk.add("test4");
	jk.add("test5");
	jk.add("test6");
	jk.add("test6");
	jk.add("test7");
	
	Iterator<String> sIter = jk.iterator();
	while(sIter.hasNext()){
		System.out.println(sIter.next());
	}
	
	
	}
}

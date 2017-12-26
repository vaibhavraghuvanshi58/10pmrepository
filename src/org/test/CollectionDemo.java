package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
		List<String> ls = new LinkedList<String>();
		ls.add("test1");
		ls.add("test2");
		ls.add("3test");
		ls.add("test4");
		ls.add("test5");
		ls.add("test6");
		
		Collections.sort(ls);
		
		for(String f : ls){
			System.out.println(f);
		}
		
//		ListIterator<String> lk = ls.listIterator();
//		while(lk.hasNext()){
//			String val = lk.next();
//			if(val.equals("test4")){
//				if(lk.hasPrevious()){
//					lk.previous();lk.previous();
//					String prev = lk.previous();
//					System.out.println(prev);
//					lk.next();lk.next();lk.next();
//				}
//			}
//		}
		
//		for(String l : ls){
//			System.out.println(l);
//		}
	}
}

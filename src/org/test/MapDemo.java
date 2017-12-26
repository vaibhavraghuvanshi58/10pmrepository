package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> mp = new 
				HashMap<String,String>();
		mp.put("name", "24");
		mp.put("age", "24");
		mp.put("place", "pune");

		//System.out.println(mp.get("age"));
		
		for(Entry<String, String> entry : mp.entrySet()){
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
	}
}

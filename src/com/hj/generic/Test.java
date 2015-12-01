package com.hj.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("a", "1");
		map.put("b", "2");
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		for(Entry<String,String> entry:entrySet){
			
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"--->"+value);
		}
		
	}
}

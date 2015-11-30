package com.hj.collection;

import java.util.HashMap;

public class SxtSet {

	HashMap map;
	private static final Object PRESENT = new Object();
	int size;
	
	public int size(){
		
		return map.size();
	}
	
	public SxtSet() {
		
		map = new HashMap();
	}
	
	public void add(Object o){
		
		map.put(o, PRESENT);
	}
	
	public static void main(String[] args) {
		
		SxtSet s = new SxtSet();
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
	}
	
	
}

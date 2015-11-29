package com.hj.collection;

/**
 * 自动以Map
 * @author Administrator
 *
 */
public class SxtMap02 {

	SxtEntry[] arr = new SxtEntry[190];
	int size;
	
	public void put(Object key,Object value){
		
		System.out.println(key.hashCode());
	}
}

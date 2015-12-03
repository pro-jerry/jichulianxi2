package com.hj.sort.col;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("我",100);
		Person p2 = new Person("流",1200);
		Person p3 = new Person("王我",1000);
		Person p4 = new Person("王",500);
		
		TreeMap<Person, String>  map = new TreeMap<Person, String>(
				
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {

						return -(o1.getHandsome()-o2.getHandsome());
					}
				}
				);
		map.put(p1, "HH");
		map.put(p2, "HH");
		map.put(p3, "HH");
		map.put(p4, "HH");
		
		//查看键
		Set<Person> persons = map.keySet();
		System.out.println(persons);
		
		
		
		
		
	}
}

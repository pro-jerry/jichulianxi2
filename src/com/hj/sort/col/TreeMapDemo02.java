package com.hj.sort.col;

import java.util.TreeMap;

public class TreeMapDemo02 {

public static void main(String[] args) {
		
		Woker w1 = new Woker("垃圾回收员",12000);
		Woker w2 = new Woker("学生",8000);
		Woker w3 = new Woker("程序员员",5000);
		
		TreeMap<Woker,String> employees = new TreeMap<Woker,String>();
		employees.put(w1,"HH");
		employees.put(w1,"HH");
		employees.put(w1,"HH");
		
		
		System.out.println(employees.keySet());
	}
}

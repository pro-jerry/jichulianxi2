package com.hj.sort.col;

import java.util.TreeSet;

/**
 * 提供了解耦的方式
 * @author Administrator
 *
 */
public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		Woker w1 = new Woker("垃圾回收员",12000);
		Woker w2 = new Woker("学生",8000);
		Woker w3 = new Woker("程序员员",5000);
		
		TreeSet<Woker> employees = new TreeSet<Woker>();
		employees.add(w1);
		employees.add(w2);
		employees.add(w3);
		
		System.out.println(employees);
	}
}

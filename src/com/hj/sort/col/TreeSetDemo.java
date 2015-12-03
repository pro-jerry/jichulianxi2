package com.hj.sort.col;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("我",100);
		Person p2 = new Person("流",1200);
		Person p3 = new Person("王我",1000);
		Person p4 = new Person("王",500);
		
		//依次存放到TreeSet容器中,使用排序的业务类（匿名内部类）
		TreeSet<Person> persons = new TreeSet<Person>(
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {

						return -(o1.getHandsome()-o2.getHandsome());
					}
				}
				);
		
		//TreeSet在添加数据时排序
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println(persons);
		
		//改变数据
		p3.setHandsome(-100);
		System.out.println("------------");
		System.out.println(persons);
		
	}
}

package com.hj.sort.col;

public class Person {

	private String name;//名称
	private int handsome;//帅气指数
	
	
	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}
	public Person() {
		name = null;
		handsome=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHandsome() {
		return handsome;
	}
	public void setHandsome(int handsome) {
		this.handsome = handsome;
	}
	@Override
	public String toString() {
		return "姓名:" + name + " |指数:" + handsome + "\n";
	}
	
	
}

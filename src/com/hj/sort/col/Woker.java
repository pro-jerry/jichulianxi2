package com.hj.sort.col;

public class Woker implements java.lang.Comparable<Woker>{

	//工种
	private String type;
	//工资
	private double salary;
	
	
	public Woker(String type, double salary) {
		super();
		this.type = type;
		this.salary = salary;
	}
	public Woker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//按工资升序排序
	@Override
	public int compareTo(Woker o) {
		// TODO Auto-generated method stub
		return this.salary>o.salary?1:(this.salary==o.salary?0:-1);
	}
	@Override
	public String toString() {
		return "Woker [type=" + type + ", salary=" + salary + "] \n";
	}
	
	
	
	
}

package com.hj.gitx.v2ch01.serialClone;


public class SerialCloneTest {

	public static void main(String[] args) {
		
		Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 1);
		Employee harry2 = (Employee) harry.clone();
		
		harry2.raiseSalary(10);
		
		System.out.println(harry);
		System.out.println(harry2);
	}
}



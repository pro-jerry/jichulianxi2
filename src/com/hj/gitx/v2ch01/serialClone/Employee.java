package com.hj.gitx.v2ch01.serialClone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends  SerialCloneable{

	 private String name;
	   private double salary;
	   private Date hireDay;

	   public Employee(String n, double s, int year, int month, int day)
	   {  
	      name = n;
	      salary = s;
	      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
	      hireDay = calendar.getTime();
	   }

	   public String getName()
	   {  
	      return name;
	   }

	   public double getSalary()
	   {  
	      return salary;
	   }

	   public Date getHireDay()
	   {  
	      return hireDay;
	   }

	   public void raiseSalary(double byPercent)
	   {  
	      double raise = salary * byPercent / 100;
	      salary += raise;
	   }

	   public String toString()
	   {  
	      return getClass().getName()
	         + "[name=" + name
	         + ",salary=" + salary
	         + ",hireDay=" + hireDay
	         + "]";
	   }
}

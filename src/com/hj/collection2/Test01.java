package com.hj.collection2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) throws ParseException {
		
		Employee e = new Employee();
		e.setId(0301);
		e.setName("HJ");
		e.setDepartment("市场部");
		e.setSalary(3000);
		String strDate="2007-07";
		DateFormat format = new SimpleDateFormat("yyyy-MM");
		e.setHireDate(format.parse(strDate));
	}
}

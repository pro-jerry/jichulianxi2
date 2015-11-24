package com.hj.gitx.v1ch12.pair2;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class PairTest2 {

	public static void main(String[] args) {
		
		GregorianCalendar [] birthdays = {
		
				new GregorianCalendar(1906, Calendar.DECEMBER, 9), // G. Hopper
	            new GregorianCalendar(1815, Calendar.DECEMBER, 10), // A. Lovelace
	            new GregorianCalendar(1903, Calendar.DECEMBER, 3), // J. von Neumann
	            new GregorianCalendar(1910, Calendar.JUNE, 22), // K. Zuse
		};
		
		Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
		Pair<GregorianCalendar> mm2 = ArrayAlg.maxmax(birthdays);
		System.out.println("min="+mm.getFirst().getTime());
		System.out.println("max="+mm.getTwo().getTime());
		
	}
}

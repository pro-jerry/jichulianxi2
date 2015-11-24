package com.hj.gitx.v1ch12.pair2;

import java.io.Serializable;
import java.util.GregorianCalendar;


public class ArrayAlg {

	public static <T extends Comparable&Serializable> Pair<T> minmax(T[] a) {

		if(a==null || a.length==0) return null;
		T min = a[0];
		T max = a[0];
		
		for(int i=0;i<a.length;i++){
			
			if(min.compareTo(a[i])>0) min=a[i];
			if(max.compareTo(a[i])<0) max=a[i];
		}
		return new Pair<>(min,max);
	}

	public static Pair<GregorianCalendar> maxmax(GregorianCalendar[] birthdays) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

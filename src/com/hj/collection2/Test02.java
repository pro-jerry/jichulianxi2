package com.hj.collection2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		Set keys = new HashSet();
		for(Iterator iter =keys.iterator();iter.hasNext(); ){
			String keyStr = (String) iter.next();
			System.out.println(keyStr);
		}
	}
}

package com.hj.sort.innerType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections对容器的比较
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		
		Collections.sort(list,new StringCom());
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}

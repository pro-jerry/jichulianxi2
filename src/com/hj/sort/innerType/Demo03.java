package com.hj.sort.innerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo03 {

	public static void main(String[] args) {
		
		String str[]={"a","abcd","abc","def"};
		Utils.sort2(str);
		System.out.println(Arrays.toString(str)+"--");
		
		//存放到容器中
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		Utils.sort3(list);
		System.out.println(list);
		System.err.println(list);
		
		//=======使用comparator排序数组========
		System.out.println("=======使用comparator排序数组========");
		String[] arr2 = new String[]{"a","abcd","abc","def"};
		Utils.sort(arr2, new StringCom());
		System.out.println(Arrays.toString(arr2));
		
	}
}

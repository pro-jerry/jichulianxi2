package com.hj.sort.innerType;

/**
 * 根据内置引用数据(常用)的比较
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		Integer a;//根据基本数据大小
		Character ch;//根据unicode编码顺序
		String str="abc";//如果一个是另外一个起始开始的子串，返回长度之差
		String str2="abcd";//否则返回第一个不相等的unicode码之差
		System.out.println(str.compareTo(str2));
		
		java.util.Date aa;//日期根据长整形数比较
	}
}

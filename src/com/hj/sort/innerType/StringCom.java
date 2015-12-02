package com.hj.sort.innerType;

/**
 * 排序規則的业务类
 * @author Administrator
 *
 */
public class StringCom implements java.util.Comparator<String>{

	/**
	 * 按长度比较大小
	 * 正数>
	 * 负数<
	 *  0 ==
	 */
	@Override
	public int compare(String o1, String o2) {

		int len1 = o1.length();
		int len2 = o2.length();
		
		return -(len1-len2);
	}

	
}

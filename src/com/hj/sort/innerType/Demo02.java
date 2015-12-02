package com.hj.sort.innerType;

import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) {
		
		String str[]={"a","abcd","abc","def"};
		sortFinal(str);
		
	}
	private static void sortFinal(String[] arr) {

		boolean sorted = true;
		int len = arr.length;
		for(int j=0;j<len-1;j++){//趟数
			sorted=true;//假定有序
			System.out.println("第"+(j+1)+"趟");
			for(int i=0;i<len-1-j;i++){//次数
				System.out.println("第"+(i+1)+"次");
				if( ((Comparable)arr[i]).compareTo(arr[i+1])>0){
					String temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					sorted=false;//假定失败
				}
				System.out.println(Arrays.toString(arr));
			}
			if(sorted){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

package com.hj.map;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		
		int[] arr = {1,3,9,5,6};
		sortFinal(arr);
	}

	private static void sortFinal(int[] arr) {

		boolean sorted = true;
		int len = arr.length;
		for(int j=0;j<len-1;j++){//趟数
			sorted=true;//假定有序
			System.out.println("第"+(j+1)+"趟");
			for(int i=0;i<len-1-j;i++){//次数
				System.out.println("第"+(i+1)+"次");
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
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
	}
}

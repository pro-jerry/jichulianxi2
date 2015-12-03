package com.hj.sort.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {

	public static void main(String[] args) {
		
		List<Integer> cards = new ArrayList<Integer>();
		//shuffle洗牌
		for(int i=0;i<54;i++){
			
			cards.add(i);
		}
		//洗牌
		Collections.shuffle(cards);
		//依次发牌
		List<Integer> p1 = new ArrayList<Integer>();
		List<Integer> p2 = new ArrayList<Integer>();
		List<Integer> p3 = new ArrayList<Integer>();
		List<Integer> last = new ArrayList<Integer>();
		for(int i=0;i<51;i+=3){
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
		}
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));
		System.out.println("第一个人"+p1);
		System.out.println("第2个人"+p2);
		System.out.println("第3个人"+p3);
		System.out.println("底牌为："+last);
	}
	
	//反转
	public static void test1(){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("反转之后:"+list);
	}
}

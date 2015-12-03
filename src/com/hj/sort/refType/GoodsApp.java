package com.hj.sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {

	public static void main(String[] args) {
		
		List<Goods> list = new ArrayList<Goods>();
		list.add(new Goods("老妈",100,0));
		list.add(new Goods("老he",50,500));
		list.add(new Goods("老LI",200,10));
		System.out.println("排序前:"+list);
		
		Collections.sort(list,new GoodsFavComp());
		System.out.println("排序后:"+list);
		
		
	}
}

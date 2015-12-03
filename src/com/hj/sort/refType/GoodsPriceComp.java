package com.hj.sort.refType;

/**
 * 按价格排序的业务类(升序)
 * @author Administrator
 *
 */
public class GoodsPriceComp implements java.util.Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		return o1.getFav()-o2.getFav();
	}

	
}

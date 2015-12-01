package com.hj.iter;

public class SxtSimpleList {

	private String[] elem = {"a","b","c"};
	private int size = elem.length;
	
	
	//计数器-->游标
	private int coursor = -1;
	
	//是否存在下一个
	public boolean hasNext(){
		
		return coursor+1<size;
	}
	
	//获取下一个
	public String next(){
		
		coursor++;
		return elem[coursor];
	}
	
	//删除下一个
	public void remove(){
		
		System.arraycopy(elem, coursor+1, elem, coursor, this.size-(coursor+1));
		this.size--;
		this.coursor--;
	}
	
	
	public static void main(String[] args) {
		
		SxtSimpleList list = new SxtSimpleList();
		
		if(list.hasNext()){
			System.out.println(list.next());
		}
		if(list.hasNext()){
			System.out.println(list.next());
		}
		if(list.hasNext()){
			System.out.println(list.next());
		}
		
		//先判断后获取
		if(list.hasNext()){
			System.out.println(list.next());
		}
	}
}

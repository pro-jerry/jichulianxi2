package com.hj.iter;

import java.util.Arrays;
import java.util.Iterator;

public class SxtDeepList implements java.lang.Iterable{

	private String[] elem=new String[5];
	//实际大小
	private int size =0;
	
	public int size(){
		
		return this.size;
	}
	
	public void add(String ele){
		
		if(this.size==ele.length()){
			elem= Arrays.copyOf(elem, elem.length+5);
		}
		
		elem[size]=ele;
		size++;
	}
	
	private class MyIter implements Iterator{
		
		// 计数器 -->指针 游标
		private int coursor = -1;

		// 判断是否存在下一个
		public boolean hasNext() {
			return coursor + 1 < size;
		}

		// 获取下一个
		public String next() {
			coursor++;
			return elem[coursor];
		}
		// 删除下一个
		
		public void remove(){
			
			//移动数组元素
			System.arraycopy(elem, 
					coursor+1, elem, coursor,
					/*SxtDeepList.this.*/size-(coursor+1));
			//实际大小-1
			/*SxtDeepList.this.*/size--;
			//回退
			this.coursor--;
		}
		
		public Iterator iterator1(){
			return new MyIter();
		}
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

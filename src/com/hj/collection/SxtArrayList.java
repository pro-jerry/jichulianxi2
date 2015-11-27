package com.hj.collection;

public class SxtArrayList{

	
	private  Object[] elementData;
	
	private int size;

	public int size(){
		return size;
	}
	
	public SxtArrayList() {

		this(10);
	}
	
	public SxtArrayList(int initialCapacity) {
		
		if(initialCapacity<0)
			throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);

		elementData = new Object[initialCapacity];
	}
	
	public void add(Object obj){
		
		if(size+1>elementData.length){
			Object[] newArray = new Object[size*2];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData=newArray;
		}
		elementData[size++] = obj;
	}
	
	public boolean isEmpty(){
		
		return size==0;
	}
	
	public Object get(int index){
		
		if(index<0||index>size){
			
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return elementData[index];
	}
	
	public void remove(int index){
		
		
	}
	
	public static void main(String[] args) {
		
		SxtArrayList sxt = new SxtArrayList(3);
		sxt.add("11");
		sxt.add("12");
		sxt.add("13");
		sxt.add("14");
		System.out.println(sxt.size());
		System.out.println(sxt.get(2));
	}
	
}

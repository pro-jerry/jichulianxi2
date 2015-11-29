package com.hj.collection;

/**
 * 自定义实现map的功能
 * @author Administrator
 *
 */
public class SxtMap01 {

	SxtEntry[] arr = new SxtEntry[190];
	int size;
	
	public void put(Object key,Object value){
		
		SxtEntry e = new SxtEntry(key,value);
		arr[size++] = e;
	}
	
	public Object get(Object key){
		
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				
				return arr[i].value;
			}
		}
		return null;
		
	}
	
	public boolean containsKety(Object key){
		
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		SxtMap01 m = new SxtMap01();
		m.put("1", "asd");
		m.put("2", "cccc");
		String str = (String) m.get("1");
		System.out.println(str);
		
	}
	
}

class SxtEntry{
	
	Object key;
	Object value;
	
	public SxtEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}

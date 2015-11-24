package com.hj.gitx.v1ch12.pair1;

public class Pair<T> {

	private T first;
	private T two;
	
	public Pair(T first, T two) {
		super();
		this.first = first;
		this.two = two;
	}

	public Pair() {
		
		first=null;
		two=null;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getTwo() {
		return two;
	}

	public void setTwo(T two) {
		this.two = two;
	}
	
	
	
	
}

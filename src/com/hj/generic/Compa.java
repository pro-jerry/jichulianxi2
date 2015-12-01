package com.hj.generic;

public interface Compa<T> {

	//q全局常理
	public static final int MAX_VALUE=100;
	public abstract void test(T t);
}

class Comm implements Compa{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}}
class Comm1 implements Compa<Integer>{

	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}}
class Comm2 implements Compa<Integer>{

	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}}

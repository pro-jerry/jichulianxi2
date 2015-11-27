package com.hj.collection;

public class SxtLinkedList {

	private Node first;
	private Node last;
	
	private int size;

	public int size() {
		return size;
	}

	public void add(Object obj) {

		Node n = new Node();
		if(obj==null){
			
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}else{
			
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			last = n;
		}
		size++;
	}
	
	public void remove(int index){
		
		Node temp = null;
		if(first!=null){
			
			temp = first;
			for(int i=0;i<index;i++){
				
				temp = temp.next;
			}
		}
		if(temp!=null){
			
			Node up = temp.previous;
			Node down = temp.next;
			
			up.next = down;
			down.previous = up;
		}
		size--;
	}
	
	public Node node(int index){
		
		Node temp = null;
		if(first!=null){
			temp = first;
			for(int i=0;i<index;i++){
				temp = temp.next;
			}
		}
		return temp;
	}
	
	
	public Object get(int index){
		
		Node temp = null;
		if(first!=null){
			
			temp = first;
			for(int i=0;i<index;i++){
				
				temp = temp.next;
			}
		}
		return temp.obj;
		
	}
	
	
	public void add(int index,Object obj){
		
		Node temp = node(index);
		Node newNode = new Node();
		newNode.obj=obj;
		if(temp!=null){
			
			Node up = temp.previous;
			up.next = newNode;
			newNode.previous = up;
			newNode.next = temp;
			
		}
	}
	
	public static void main(String[] args) {
		
		SxtLinkedList list = new SxtLinkedList();
		list.add("aaa");
		System.out.println(list.size());
	}

	
}

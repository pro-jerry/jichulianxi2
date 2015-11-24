package com.hj.gitx.v1ch12.pair1;

public class PairTest1 {

	public static void main(String[] args) {
		
		String[] words = {"Marry","had","a","little","lamb"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min="+mm.getFirst());
		System.out.println("max="+mm.getTwo());
	}
}

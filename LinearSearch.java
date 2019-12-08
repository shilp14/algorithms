package com.algorithm.searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] ar= {8,3,49,2,7,9,1};
		int key=5;
		
		System.out.println(isKeyPresent(ar,key));
		
	}
	
	private static boolean isKeyPresent(int [] ar,int k) {
		for(int i=0;i<ar.length;i++) {
			if(k==ar[i])
				return true;
			
		}
		return false;
	}
	
	

}

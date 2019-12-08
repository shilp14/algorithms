package com.algorithm.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] ar= {8,3,49,2,7,9,1};
		int key=19;
		System.out.println(isKeyPresent(ar,key));

	}
	
	public static boolean isKeyPresent(int[] ar,int key) {
		
		int start=0;
		int end=ar.length;
		while(start<end) {
			int mid=(end+start)/2;
			if(ar[mid]==key)
				return true;
			else if(ar[mid]<key)
			{
				start=mid+1;	
			}
			else {
				
				end=mid-1;
			}
			
		}
		
		return false;
	}
	
	

}

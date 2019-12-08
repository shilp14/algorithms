package com.algorithm.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
    String [] arr= {"shilpi","juhi","apporva"};
    selectionSort(arr);
    for(String s :arr) {
    	System.out.println(s);
    }
    
	}
	
	public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
		
		int minIndex=0;
		for(int i=0;i<arr.length;i++) {
			minIndex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[minIndex].compareTo(arr[j])>0) {
					minIndex=j;
				}
				
			}
			T temp= arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	
	}
	
}

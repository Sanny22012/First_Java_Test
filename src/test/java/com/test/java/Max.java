package com.test.java;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,6,34};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<max)
			max= arr[i];
		}
		
			System.out.println(max);
		

	}

}

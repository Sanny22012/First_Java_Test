package com.test.java;

import java.util.Arrays;   
public class SortArray  {
public static void main(String[] args) { 
	int [] array ={2, 90, 23, 5, 109, 12, 22, 67, 34, 1};
	Arrays.sort(array);   
	
	System.out.println("Elements of array sorted in ascending order: "); 
		for (int i = 0; i < array.length; i++)   
		{       
			System.out.println(array[i]);   
			}   
		}  
}  
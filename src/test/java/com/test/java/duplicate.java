package com.test.java;

import java.util.Scanner;

public class duplicate {
	 public static void main(String[] args) {
	        int arr[] = {1,1,2,2,5,7,7};
	        System.out.println("Duplicate element in array:");
	        
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1 ; j<arr.length;j++){
	                if(arr[i]==arr[j]){
	                    System.out.print(arr[i] + " ");
	                    break;
	                }
	                
	            }
	        }
	        
	    }
	}


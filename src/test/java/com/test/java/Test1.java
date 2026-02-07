package com.test.java;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MandEEp";
		String lower = "";
		String larger = "";
		int lowerCount = 0;
		int largerCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch >= 90) {
				larger = larger + ch;
				largerCount++;
			} else {
				lower = lower + ch;
				lowerCount++;
			}
		} 
		System.out.println("lower : " + lower + "  Lower count " + lowerCount);
		System.out.println("larger : " + larger + "   Larger count " + largerCount);

	}

}

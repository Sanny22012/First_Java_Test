package com.test.java;

public class vowel {
    public static void main(String[] args) {
        String input = "Hello World Sanny   Anand  "; 
        int vowelCount = 0;
        input = input.toLowerCase();   // Convert string to lower case for easy comparison

        for (int i = 0; i < input.length(); i++) {    // Iterate through the string and count vowels
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}


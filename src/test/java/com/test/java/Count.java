package com.test.java;

public class Count {
    public static void main(String[] args) {
        String str = "This is a simple sentence.";  // Input string
        int count = str.trim().split("\\s+").length;  // Trim and split by spaces one or more space
        System.out.println("Total number of words: " + count);
    }
}


package com.test.java;

import org.junit.jupiter.api.Test;

public class duplicate {

    @Test
    void printDuplicateElements() {

        int[] arr = {1, 1, 2, 2, 5, 7, 7};

        System.out.println("Duplicate elements in array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        System.out.println("Duplicate test executed successfully");
    }
}

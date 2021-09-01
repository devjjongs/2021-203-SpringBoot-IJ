package com.bit.x4.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 2, 0, 4, 3, 6, 5, 7, 8};
        int arr2;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    arr2 = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = arr2;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

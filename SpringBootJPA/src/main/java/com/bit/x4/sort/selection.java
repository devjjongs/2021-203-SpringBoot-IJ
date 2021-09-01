package com.bit.x4.sort;

public class selection {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 3, 7, 2, 5, 4, 8, 6, 9};

    }

    public void selectionSort(int[] arr) {
        selectionSort(arr, arr.length);
    }

    public void selectionSort(int[] a, int size) {
        for (int i = 0; i < size - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[indexMin]) {
                    indexMin = j;
                }
            }
            swap(a, indexMin, i);
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

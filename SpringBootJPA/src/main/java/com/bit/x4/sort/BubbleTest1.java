package com.bit.x4.sort;

public class BubbleTest1 {
    public static void main(String[] args) {
        int arr[] = {99, 87, 45, 21, 5};
//        System.out.println(0 + " " + 1);
//        System.out.println(1 + " " + 2);
//        System.out.println(2 + " " + 3);
//        System.out.println(3 + " " + 4);

//        for (int i = 0; i < 4; i++) {
//            System.out.println(i + " " + (i + 1));
//        }

        int 책상;
        for (int r = 0; r < arr.length; r++) {
            //==>반복할 덩어리#1
            for (int i = 0; i < 4; i++) {
                System.out.println("비교전 " + arr[i] + " " + arr[i + 1]);
                if (arr[i] > arr[i + 1]) {
                    책상 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = 책상;
                }
                System.out.println("비교후 " + arr[i] + " " + arr[i + 1]);
            }

            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println(arr[i] + " " + arr[i + 1] + "\n");
            }
            //<==반복할 덩어리#1
        }
    }
}

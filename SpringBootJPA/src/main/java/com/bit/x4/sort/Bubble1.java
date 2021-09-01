package com.bit.x4.sort;

public class Bubble1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {99, 87, 45, 21, 5};
        //int arr[] = { 2, 5, 21, 45,87, 99};

        int 책상;
        int count = 0, total = 0, ifCount = 0, end = arr.length - 1;
        for (int r = 0; r < arr.length; r++) {
            // ==> 반복할 덩어리#1
            count = 0;
//			for (int i = 0; i < arr.length - 1; i++) {
            for (int i = 0; i < end; i++) {
                total++;
                System.out.println("비교전 " + arr[i] + " " + arr[i + 1]);
                if (arr[i] > arr[i + 1]) {
                    책상 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = 책상;
                    count++;
                    ifCount++;
                }
//
                System.out.println("비교후 " + arr[i] + " " + arr[i + 1]);
            }// for i 안쪽1  end

            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println("====>" + arr[i] + " " + arr[i + 1] + "\n");
            }// 안쪽2
            //count 0보다 큰지 아닌지
            end = count - 1;
            System.err.println("바깥for회전수: " + (r + 1) + "  교체 수 :" + count + "   end :" + end + " 안쪽 for 문 실행수:" + total + "  ifCount:" + ifCount);

            if (count == 0) {
                break;
            }

            // <== 반복할 덩어리#1
        }// for r 바깥 end

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.err.println("총 교체 수 :" + count + " ====" + total + "  ifCount:" + ifCount);
    }// main()

}
package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxMinTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(11);
        list.add(490);
        list.add(24);

        Iterator<Integer> iterator = list.iterator();
        int tempi = iterator.next();
        while (iterator.hasNext()) {
            int nextData = iterator.next();
            if (tempi < nextData) {
                tempi = nextData;
                System.out.println(tempi);
            }
        }


        System.out.println("------------iterator-------------");


        int[] nums = {4, 11, 490, 24};
        int temp = nums[0];

        // 0번째 자리의 값 보다 큰 값을 찾는다
        if (temp < nums[1]) // 1번이 0번보다 크다면
            temp = nums[1]; // 11 // 1번으로 값을 바꿈
//        else
//            temp = temp;

        if (temp < nums[2])
            temp = nums[2]; // 424

        if (temp < nums[3])
            temp = nums[3]; // 24

        System.out.println("temp = " + temp);
        System.out.println("---------------if----------------");

        temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp < nums[i])
                temp = nums[i];

            System.out.println(temp);
        }
        System.out.println("최종적으로 temp = " + temp);
        System.out.println("---------------for----------------");
    }
}

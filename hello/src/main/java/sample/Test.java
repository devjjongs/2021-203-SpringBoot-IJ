package sample;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        String str1 = "1234";
        //int a = (int)str1; // 불가
        int a = Integer.parseInt(str1);
        int b = Integer.valueOf(str1); //boxing
        int c = b; //unboxing

        Integer d = 4; //autoboxing // 원래는 new Integer(4); 로 작성 해야하지만 버전이 높아지면서 허용

        Date date;


    }
}

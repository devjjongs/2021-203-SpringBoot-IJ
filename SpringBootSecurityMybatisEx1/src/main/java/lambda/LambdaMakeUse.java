package lambda;

public class LambdaMakeUse {    //  lambda를 이용한 작업 방식
    public static void main(String[] args) {
        Operator mult = new Operator() {

            @Override
            public int calc(int a, int b) {
                return 0;
            }
        };

        System.out.println(mult.calc(234, 23));

        Operator mult2 = /*new Operator() {
            @Override
            public int calc */(int a, int b) -> {
            return a * b;
        };
    }

}



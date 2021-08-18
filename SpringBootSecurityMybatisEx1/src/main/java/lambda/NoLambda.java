package lambda;

public class NoLambda { //  lmabda를 사용하기 전 작업 방식
    static Operator add = new Operator() {  //  main에서 사용하기 위해 static 선언

        @Override
        public int calc(int a, int b) {
            return a + b;
        }
    };

    public static class 뺄쌤 implements Operator {    //  명시된 inner class

        @Override
        public int calc(int a, int b) {
            return a - b;
        }
    }

    public static void main(String[] args) {
        System.out.println(add.calc(7, 7));
        뺄쌤 min = new 뺄쌤();
        System.out.println(min.calc(234, 23));

        Operator mult = new Operator() {
            @Override
            public int calc(int a, int b) {
                return 0;
            }
        };

        System.out.println(mult.calc(234, 23));
    }
}

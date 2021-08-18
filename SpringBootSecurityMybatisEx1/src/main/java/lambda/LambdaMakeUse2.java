package lambda;

public class LambdaMakeUse2 {    //  lambda를 이용한 작업 방식
    public void exec(Operator op) {
        int k = 10;
        int m = 20;
        int value = op.calc(k, m);
        System.out.println(k + ", " + m + ", " + value);
    }

    public static void main(String[] args) {
        LambdaMakeUse2 use2 = new LambdaMakeUse2();
        use2.exec(new Operator() {

            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // 두 가지 형식 모두 사용 가능
        use2.exec((i, j) -> {return i + j;});
        use2.exec((i, j) -> i + j);

    }
}


package lambda;

@FunctionalInterface
public interface Operator {
    int calc(int a, int b);
//    @FunctionalInterface 를 사용해서 메소드가 추가되면 에러 발생
//    void out();   //  메소드가 추가되었기 때문에 에러 발생
}

package generics;

public class BoxUse {

    public void someMethod(Box<Number> n) {
        /* ..Box 클래스의 엘레멘트 타입이 Number 라는 의미로 파생된 것들이 올 수 없다.. */
    }

    public void someMethod(Number n) {
        /* ..매개변수의 타입은 Number로 부터 파생된 서브클래스는 다 올 수 있다.. */
    }

    public void someMethod2(Box<? extends Number> n) {
        /* .... */
    }

    public static void main(String[] args) {
        Number n = new Integer(10);
        Number n2 = new Double(10.1);

        Box<Number> box = new Box<Number>();
        box.add(new Integer(10));

        BoxUse ref = new BoxUse();
        ref.someMethod(new Box<Number>());
//        ref.someMethod(new Box<Integer>());
        ref.someMethod2(new Box<Integer>());
    }
}

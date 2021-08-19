package trreada;

public class Use3 {
    public static void main(String[] args) {
        System.out.println(1);
        Thread thread = new MyThread3("th1");
        Thread thread2 = new MyThread3("th2");

        System.out.println(2);

        thread2.start();
        thread.start();
        System.out.println(3);
        System.out.println(Thread.currentThread().getName());   // main

        // main이 Thread의 우선순위가 더 높음
    }
}

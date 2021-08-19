package trreada;

public class Use2 {
    public static void main(String[] args) {
        System.out.println(1);
        Thread thread = new MyThread2("th1");
        Thread thread2 = new MyThread2("th2");

        System.out.println(2);

        thread2.start();
        thread.start();
        System.out.println(3);
        System.out.println(Thread.currentThread().getName());   // main

        // main이 Thread의 우선순위가 더 높음
    }
}

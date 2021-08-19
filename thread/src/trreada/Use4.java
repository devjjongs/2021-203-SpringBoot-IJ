package trreada;

public class Use4 {
    public static void main(String[] args) {
        System.out.println(1);
        Thread thread = new MyThread4("th1");
        Thread thread2 = new MyThread4("th2");

        System.out.println(2);
        try { //MAIN THREAD JOIN
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Thread.yield();

        thread2.start();
//        thread2.yield();
        thread.start();
        System.out.println(3);
        System.out.println(Thread.currentThread().getName());   // main

        // main이 Thread의 우선순위가 더 높음
    }
}

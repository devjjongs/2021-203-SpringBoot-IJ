package trreada;

public class Use5 {
    public static void main(String[] args) {
        System.out.println(1);
        Runnable target = () -> {

            for (int i = 0; i <= 10; i++) {

                System.out.println("No Thread class getName()" + " : " + i + " " + Thread.currentThread().getName());
            }
        };
        Runnable target2 = new MyThreadTarget();

        Thread thread = new Thread(target, "th1");
        //target : run 메소드에 의해 실행되어질 대상
        Thread thread2 = new Thread(target, "th2");

        System.out.println(2);

        thread2.start();
//        thread2.yield();
        thread.start();
        System.out.println(3);
        System.out.println(Thread.currentThread().getName());   // main

        // main이 Thread의 우선순위가 더 높음
    }
}

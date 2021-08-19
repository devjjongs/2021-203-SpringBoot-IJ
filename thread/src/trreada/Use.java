package trreada;

public class Use {
    public static void main(String[] args) {
        System.out.println(1);
        Thread thread = new MyThread();
        System.out.println(2);

        thread.start();
        System.out.println(3);
        System.out.println(Thread.currentThread().getName());

        // main이 Thread의 우선순위가 더 높음
    }
}

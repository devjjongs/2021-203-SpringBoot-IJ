package trreada;

public class MyThreadTarget implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {

            System.out.println("No Thread class getName()" + " : " + i + " " + Thread.currentThread().getName());
        }
    }
}

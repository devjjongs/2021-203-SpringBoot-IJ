package trreada;

public class MyThread2 extends Thread {

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {

            System.out.println(getName() + " : " + i);
        }
    }
}

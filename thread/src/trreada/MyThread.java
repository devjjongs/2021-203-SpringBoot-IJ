package trreada;

public class MyThread extends Thread {

    public MyThread() {
        super(MyThread.class.getName());    // 가능은 하지만 비효율적
//        super("MyThread");  //  이 방법이 더 효율적
    }

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {

            System.out.println(getName() + " : " + i);
        }
    }
}

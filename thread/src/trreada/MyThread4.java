package trreada;

public class MyThread4 extends Thread {

    public MyThread4(String name) {

        super(name);
        //super("MyThread");
    }

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {

            System.out.println(getName() + " : " + i);
        }
    }
}

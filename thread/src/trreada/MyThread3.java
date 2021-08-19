package trreada;

public class MyThread3 extends Thread {

    public MyThread3(String name) {

        super(name);
        //super
    }

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {

            System.out.println(getName() + " : " + i);
            try {

                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

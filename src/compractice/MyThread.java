package compractice;

public class MyThread implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(12);
        }catch (InterruptedException e){
            e.getMessage();
        }

        System.out.println("thread is running");
    }

    public static void main(String[] args) {

        MyThread th = new MyThread();
        Thread t = new Thread(th);
        t.start();


    }


}

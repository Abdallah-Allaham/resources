package concurrency;

class Main{
    public static void main(String[] args){
        Thread thread1 = new ThreadImpl();
        Thread thread2 = new ThreadImpl2();

        Runnable runnable= new ThreadImpl3();
        Thread thread3 = new Thread(runnable);

        thread1.run();
        thread2.run();
        thread3.run();

        System.out.println();

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println();
    }
}

public class ThreadImpl extends Thread {
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            System.out.print(i+" ");
        }
    }
}

class ThreadImpl2 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            System.out.print('a'+" ");
        }
    }
}

class ThreadImpl3 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<50;i++){
            System.out.print("Abood ");
        }
    }
}

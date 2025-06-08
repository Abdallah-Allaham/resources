package concurrency;

public class RaceCondition {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Runnable runnableWithoutsynch = () ->{
          for (int i=0;i<1000;i++){
              counter++;
          }
        };

        Thread thread1 = new Thread(runnableWithoutsynch);
        Thread thread2 = new Thread(runnableWithoutsynch);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("without synchronized "+counter);

        /// ///////////////////////////////////////////////////////////////
        counter = 0;

        Runnable runnableWithsynch = () ->{
            for (int i=0;i<1000;i++){
                synchronized (RaceCondition.class){counter++;};
            }
        };

        Thread threadSync1 = new Thread(runnableWithsynch);
        Thread threadSync2 = new Thread(runnableWithsynch);

        threadSync1.start();
        threadSync2.start();

        threadSync1.join();
        threadSync2.join();

        System.out.println("with synchronized "+counter);
    }
}

/*Create 5 threads and print "Hello India" Using Runnable interface*/

public class Main {
  public static void main(String[] args) {
    Thread t1 = new Thread(new Main().new RunnableImpl());
    Thread t2 = new Thread(new Main().new RunnableImpl());
    Thread t3 = new Thread(new Main().new RunnableImpl());
    Thread t4 = new Thread(new Main().new RunnableImpl());
    Thread t5 = new Thread(new Main().new RunnableImpl());
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }

  private class RunnableImpl implements Runnable {
    public void run() {
      System.out.println("Hello India");
    }
  }
}
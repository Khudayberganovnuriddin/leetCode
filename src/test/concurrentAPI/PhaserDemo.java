package test.concurrentAPI;

import java.util.concurrent.Phaser;

/**
 * @author Khudayberganov Nuriddin
 * @since : 11/11/25 / 12:26
 */
public class PhaserDemo {

  public static void main(String[] args) {
    Phaser phaser = new Phaser(1);
    int curPhase;

    System.out.println("Starting...");

    new Thread(new MyThread(phaser, "A")).start();
    new Thread(new MyThread(phaser, "B")).start();
    new Thread(new MyThread(phaser, "C")).start();

    curPhase = phaser.getPhase();
    phaser.arriveAndAwaitAdvance();
    System.out.println("Phase " + curPhase + " complete");

    curPhase = phaser.getPhase();
    phaser.arriveAndAwaitAdvance();
    System.out.println("Phase " + curPhase + " complete");

    curPhase = phaser.getPhase();
    phaser.arriveAndAwaitAdvance();
    System.out.println("Phase " + curPhase + " complete");

    phaser.arriveAndDeregister();
    if (phaser.isTerminated()) {
      System.out.println("The pahser is terminated");
    }
  }

  static class MyThread implements Runnable {
    Phaser phsr;
    String name;

    public MyThread(Phaser phsr, String name) {
      this.phsr = phsr;
      this.name = name;
      phsr.register();
    }

    @Override
    public void run() {
      System.out.println("Thread " + name + " Beginning Phase one");
      phsr.arriveAndAwaitAdvance();

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.println(e);
      }

      System.out.println("Thread " + name + " Beginning Phase two");
      phsr.arriveAndAwaitAdvance();

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.println(e);
      }

      System.out.println("Thread " + name + " Beginning Phase three");
      phsr.arriveAndDeregister();
    }
  }
}

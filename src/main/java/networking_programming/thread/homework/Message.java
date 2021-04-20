package networking_programming.thread.homework;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Message {

    private final ConcurrentLinkedQueue<Integer> integerConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();

    synchronized void putValue() {
        while (integerConcurrentLinkedQueue.size() == 5) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int randNumber = new Random().nextInt(100);
        integerConcurrentLinkedQueue.add(randNumber);
        System.out.println(randNumber + "\t(Put random number)");
        this.notify();
    }

    synchronized void getValue() {
        while (integerConcurrentLinkedQueue.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(integerConcurrentLinkedQueue.poll() + "\t Get Number");
        this.notify();
    }
}

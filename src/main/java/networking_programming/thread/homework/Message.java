package networking_programming.thread.homework;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Message {

    private final ConcurrentLinkedQueue<Integer> integerConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();

    synchronized void putValue() {
        while (integerConcurrentLinkedQueue.size() < 5) {
            int randNumber = new Random().nextInt(100);
            integerConcurrentLinkedQueue.add(randNumber);
            System.out.println(randNumber + "\t(Put random number)");
            this.notify();
        }
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void getValue() {
        while (integerConcurrentLinkedQueue.size() > 0) {
            System.out.println(integerConcurrentLinkedQueue.poll() + "\t Get Number");
            this.notify();
        }
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

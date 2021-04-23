package networking_programming.thread.homework1.util;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Message {

    private final ConcurrentLinkedQueue<Integer> integerConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();

    private final JTextArea jTextArea;

    public Message(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    synchronized void putValue() {
        while (integerConcurrentLinkedQueue.size() < 5) {
            int randNumber = new Random().nextInt(100);
            integerConcurrentLinkedQueue.add(randNumber);
            System.out.println(randNumber + "\t Put random number");
            jTextArea.append(randNumber + "\t Put random number\n");
            notify();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void getValue() {
        while (integerConcurrentLinkedQueue.size() > 0) {
            String dataPollString = integerConcurrentLinkedQueue.poll() + "\t Get Number";
            System.out.println(dataPollString);
            jTextArea.append(dataPollString + "\n");
            notify();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

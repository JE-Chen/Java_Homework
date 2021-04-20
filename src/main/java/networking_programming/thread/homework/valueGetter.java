package networking_programming.thread.homework;

public class valueGetter extends Thread {

    private final Message message;

    public valueGetter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true)
            this.message.getValue();
    }
}


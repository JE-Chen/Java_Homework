package networking_programming.thread.homework;

public class Main {


    public static void main(String[] argv) {
        Message message = new Message();
        (new valuePutter(message)).start();
        (new valueGetter(message)).start();
    }

}

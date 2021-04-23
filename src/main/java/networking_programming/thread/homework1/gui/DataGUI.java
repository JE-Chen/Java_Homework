package networking_programming.thread.homework1.gui;

import networking_programming.thread.homework1.util.Message;
import networking_programming.thread.homework1.util.valueGetter;
import networking_programming.thread.homework1.util.valuePutter;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DataGUI extends JFrame {
    private JPanel jPanel;
    private JTextArea dataOutput;

    private String windowName = "顯示執行結果";

    public DataGUI(String windowName) {
        this.windowName = windowName;
        setTitle(windowName);
        setSize(800, 800);
        setContentPane(jPanel);
        setVisible(true);
        closeEvent();

        Message message = new Message(dataOutput);
        Thread putter = new valuePutter(message);
        Thread getter = new valueGetter(message);
        putter.start();
        getter.start();
    }

    protected void closeEvent() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println(windowName + " Frame Closed");
                DataGUI.this.dispose();
                System.exit(0);
            }
        });
    }
}

package Algorithm.GUI.main;

import Algorithm.GUI.GuiFather;
import Algorithm.GUI.sortgui.SortGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm extends GuiFather {
    private JTextField main_input_choose;
    private JPanel jPanel;
    private JButton main_choose_button;

    private void selectFunction(String selectString) {
        switch (selectString) {
            case "5":
                new SortGUI("排序頁面");
                break;
        }
    }

    public MainForm(String windowName) {
        super(windowName);
        setContentPane(jPanel);
        setVisible(true);

        main_choose_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectFunction(main_input_choose.getText());
            }
        });

        main_input_choose.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    selectFunction(main_input_choose.getText());
                }
            }
        });
    }
}

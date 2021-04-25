package algorithm.gui.main;

import algorithm.gui.GUIFather;
import algorithm.gui.sort_gui.SortGUI;
import algorithm.gui.sudent_data_gui.add.AddStudentDataGUI;
import algorithm.gui.sudent_data_gui.remove.RemoveStudentDataGUI;
import algorithm.gui.sudent_data_gui.show.ShowStudentDataGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm extends GUIFather {
    private JTextField main_input_choose;
    private JPanel jPanel;
    private JButton main_choose_button;

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

    private void selectFunction(String selectString) {
        switch (selectString) {
            case "1":
            case "2":
                new ShowStudentDataGUI("學生資料");
                break;
            case "3":
                new AddStudentDataGUI("增加學生資料");
                break;
            case "4":
                new RemoveStudentDataGUI("刪除學生資料");
                break;
            case "5":
                new SortGUI("排序頁面");
                break;
            case "6":
                this.dispose();
                System.exit(0);
                break;
            default:
        }
    }

}

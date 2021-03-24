package Algorithm.GUI.sortgui;

import Algorithm.GUI.GuiFather;
import Algorithm.Sort.InsertionSort;
import Algorithm.Sort.MergeSort;
import Algorithm.Sort.StudentData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static Algorithm.Sort.SortUtils.printStudentData;

public class SortGUI extends GuiFather {
    private JButton sortGUI_determine;
    private JTextField sortGUI_input;
    private JPanel jPanel;
    private JLabel sortGUILabel;
    private JTextArea sortOutput;

    private StudentData[] studentData = {
            new StudentData(97502, "DS", 79),
            new StudentData(97501, "DS", 76),
            new StudentData(97523, "DS", 49)};

    private void selectFunction(String selectString) {
        switch (selectString) {
            case "1":
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.sort(studentData);
                printStudentData(studentData, sortOutput);
                sortOutput.append(insertionSort.getSortData() + "\n");
                break;
            case "2":
                MergeSort mergeSort = new MergeSort();
                mergeSort.sort(studentData);
                printStudentData(studentData, sortOutput);
                sortOutput.append(mergeSort.getSortData() + "\n");
                break;
            case "DS":
                sortGUILabel.setText("" +
                        "<html>請選擇排序方法：" +
                        "<br> 1.Insertion " +
                        "<br> Sort 2.Merge Sort</html>");
                break;
        }
    }

    public SortGUI(String windowName) {
        super(windowName);
        setContentPane(jPanel);
        setVisible(true);
        sortOutput.setEditable(false);

        sortGUI_determine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectFunction(sortGUI_input.getText());
            }
        });

        sortGUI_input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    selectFunction(sortGUI_input.getText());
                }
            }
        });
    }
}

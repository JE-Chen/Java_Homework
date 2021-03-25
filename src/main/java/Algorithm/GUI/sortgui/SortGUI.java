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
    private StudentData[] studentData;
    private String type = "";

    private void setSortGUILabel() {
        sortGUILabel.setText("" +
                "<html>請選擇排序方法：" +
                "<br> 1.Insertion Sort" +
                "<br> 2.Merge Sort</html>");
    }

    private void selectFunction(String selectString) {
        switch (selectString) {

            case "1":
                studentData = new StudentData[]{
                        new StudentData(97502, "DS", 79, "DM", 76, "LA", 63, type),
                        new StudentData(97501, "DS", 76, "DM", 79, "LA", 98, type),
                        new StudentData(97523, "DS", 49, "DM", 49, "LA", 78, type)};
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.sort(studentData);
                printStudentData(studentData, sortOutput);
                sortOutput.append(insertionSort.getSortData() + "\n");
                break;

            case "2":
                studentData = new StudentData[]{
                        new StudentData(97502, "DS", 79, "DM", 76, "LA", 63, type),
                        new StudentData(97501, "DS", 76, "DM", 79, "LA", 98, type),
                        new StudentData(97523, "DS", 49, "DM", 49, "LA", 78, type)};
                MergeSort mergeSort = new MergeSort();
                mergeSort.sort(studentData);
                printStudentData(studentData, sortOutput);
                sortOutput.append(mergeSort.getSortData() + "\n");
                break;

            case "DS":
                type = "DS";
                setSortGUILabel();
                break;

            case "DM":
                type = "DM";
                setSortGUILabel();
                break;

            case "LA":
                type = "LA";
                setSortGUILabel();
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

package Algorithm.GUI.sortgui;

import Algorithm.GUI.GuiFather;
import Algorithm.Sort.InsertionSort;
import Algorithm.Sort.MergeSort;
import Algorithm.Sort.RadixSort;
import Algorithm.Sort.StudentData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.TreeMap;


public class SortGUI extends GuiFather {
    private JButton sortGUI_determine;
    private JTextField sortGUI_input;
    private JPanel jPanel;
    private JLabel sortGUILabel;
    private JTextArea sortOutput;
    private StudentData<String, TreeMap<String, Integer>, String, Integer>[] studentData = new StudentData[3];
    private String type = "";

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

        HashMap<String, TreeMap<String, Integer>> studentHashMap = new HashMap<>();
        TreeMap<String, Integer> student1TreeMap = new TreeMap<>();
        student1TreeMap.put("DS", 80);
        student1TreeMap.put("DM", 76);
        student1TreeMap.put("LA", 63);
        TreeMap<String, Integer> student2TreeMap = new TreeMap<>();
        student2TreeMap.put("DS", 53);
        student2TreeMap.put("DM", 79);
        student2TreeMap.put("LA", 98);
        TreeMap<String, Integer> student3TreeMap = new TreeMap<>();
        student3TreeMap.put("DS", 83);
        student3TreeMap.put("DM", 49);
        student3TreeMap.put("LA", 78);
        studentHashMap.put("97501", student1TreeMap);
        studentData[0] = (new StudentData<>(student1TreeMap, "97501", "DS"));
        studentHashMap.put("97502", student2TreeMap);
        studentData[1] = (new StudentData<>(student2TreeMap, "97502", "DS"));
        studentHashMap.put("97523", student3TreeMap);
        studentData[2] = (new StudentData<>(student3TreeMap, "97523", "DS"));

        /*
        97501 DS 80 DM 76 LA 63
        97502 DS 53 DM 79 LA 98
        97523 DS 83 DM 49 LA 78
         */
    }

    private void setSortGUILabel() {
        sortGUILabel.setText("" +
                "<html>請選擇排序方法：" +
                "<br> 1.Insertion Sort" +
                "<br> 2.Merge Sort" +
                "<br> 3.Radix Sort" +
                "</html>");
    }

    private void selectFunction(String selectString) {
        switch (selectString) {

            case "1":
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.sort(studentData);
                studentData[0].printStudentData(studentData, sortOutput);
                sortOutput.append(insertionSort.getSortData() + "\n");
                break;

            case "2":
                MergeSort mergeSort = new MergeSort();
                mergeSort.sort(studentData);
                studentData[0].printStudentData(studentData, sortOutput);
                sortOutput.append(mergeSort.getSortData() + "\n");
                break;

            case "3":
                RadixSort radixSort = new RadixSort();
                radixSort.sort(studentData);
                studentData[0].printStudentData(studentData, sortOutput);
                sortOutput.append(radixSort.getSortData() + "\n");
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

}

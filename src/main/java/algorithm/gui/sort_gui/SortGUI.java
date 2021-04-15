package algorithm.gui.sort_gui;

import algorithm.gui.GuiFather;
import algorithm.sort.InsertionSort;
import algorithm.sort.MergeSort;
import algorithm.sort.RadixSort;
import algorithm.sort.SortAlgorithm;
import algorithm.student.StudentData;
import algorithm.student.StudentDataProcess;
import algorithm.util.file.FileIO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;


public class SortGUI extends GuiFather {
    private JButton sortGUI_determine;
    private JTextField sortGUI_input;
    private JPanel jPanel;
    private JLabel sortGUILabel;
    private JTextArea sortOutput;
    private StudentData<String, TreeMap<String, Integer>, String, Integer>[] studentDataArray;
    private final FileIO fileIO = new FileIO();
    private final StudentDataProcess studentDataProcess = new StudentDataProcess();

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
        studentDataArray[0] = (new StudentData<>(student1TreeMap, "97501", "DS"));
        studentHashMap.put("97502", student2TreeMap);
        studentDataArray[1] = (new StudentData<>(student2TreeMap, "97502", "DS"));
        studentHashMap.put("97523", student3TreeMap);
        studentDataArray[2] = (new StudentData<>(student3TreeMap, "97523", "DS"));

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
                "<br> 或是輸入 0 讀取檔案" +
                "<br>也可輸入科目名稱設定排序科目" +
                "</html>");
    }

    private void setSortType(String sortType) {
        for (StudentData<String, TreeMap<String, Integer>, String, Integer> tempStudentData : studentDataArray)
            tempStudentData.setSortUseType(sortType);
    }

    private void sort(SortAlgorithm sortAlgorithm) {
        sortAlgorithm.sort(studentDataArray);
        studentDataArray[0].printStudentData(studentDataArray, sortOutput);
        sortOutput.append(sortAlgorithm.getSortData() + "\n");
    }

    private void selectFunction(String selectString) {
        switch (selectString) {

            case "0":
                try {
                    File file = fileIO.fileChooser();
                    String rawStudentDataString = fileIO.readFile(file);
                    studentDataArray = studentDataProcess.processRawString(rawStudentDataString);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case "1":
                InsertionSort insertionSort = new InsertionSort();
                sort(insertionSort);
                break;

            case "2":
                MergeSort mergeSort = new MergeSort();
                sort(mergeSort);
                break;

            case "3":
                RadixSort radixSort = new RadixSort();
                sort(radixSort);
                break;

            case "DS":
                setSortType("DS");
                setSortGUILabel();
                break;
            case "DM":
                setSortType("DM");
                setSortGUILabel();
                break;
            case "LA":
                setSortType("LA");
                setSortGUILabel();
                break;
        }
    }

}

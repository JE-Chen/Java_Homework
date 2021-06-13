package algorithm.gui.sudent_data_gui.add;

import algorithm.gui.GUIFather;
import algorithm.student.StudentData;
import algorithm.student.StudentDataProcess;
import algorithm.util.file.FileChooser;
import algorithm.util.file.FileInput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public class AddStudentDataGUI extends GUIFather {
    private static StudentData<String, TreeMap<String, Integer>, String, Integer>[] studentDataArray;
    private final FileInput fileInput = new FileInput();
    private final FileChooser fileChooser = new FileChooser();
    private JTextArea outputTextArea;
    private JPanel panel1;
    private JButton readFileButton;
    private JTextField inputAddTextField;
    private JButton addDataButton;

    //TODO Add data gui
    public AddStudentDataGUI(String windowName, String tip) {
        super(windowName);
        readFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readFile();
            }
        });
    }

    private void readFile() {
        try {
            File file = fileChooser.chooseFile();
            if (file != null) {
                String rawStudentDataString = fileInput.readFile(file);
                StudentDataProcess studentDataProcess = new StudentDataProcess();
                studentDataArray = studentDataProcess.processRawString(rawStudentDataString);
            } else
                JOptionPane.showMessageDialog(null, "未知輸入", "未知輸入錯誤", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

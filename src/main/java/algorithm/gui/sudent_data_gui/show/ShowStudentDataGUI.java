package algorithm.gui.sudent_data_gui.show;

import algorithm.gui.GUIFather;

import javax.swing.*;

public class ShowStudentDataGUI extends GUIFather {
    //TODO Show data gui
    private JPanel jPanel;
    private JTextArea showStudentDataArea;
    private JButton clickToShow;
    private JComboBox<String> checkOneOrAllDataChooser;
    private JTextField subjectInput;

    public ShowStudentDataGUI(String windowName) {
        super(windowName);
        checkOneOrAllDataChooser.addItem("單科");
        checkOneOrAllDataChooser.addItem("全部");
    }

}

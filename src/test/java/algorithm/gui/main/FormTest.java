package algorithm.gui.main;

import algorithm.gui.save_data_gui.SaveDataGUI;
import algorithm.gui.sort_gui.SortGUI;
import algorithm.gui.sudent_data_gui.add.AddStudentDataGUI;
import algorithm.gui.sudent_data_gui.remove.RemoveStudentDataGUI;
import algorithm.gui.sudent_data_gui.show.ShowStudentDataGUI;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FormTest {

    @Test
    public void formTest(){
        new MainForm("主頁").dispose();
        new SaveDataGUI("主頁").dispose();
        new SortGUI("主頁").dispose();
        new AddStudentDataGUI("主頁").dispose();
        new RemoveStudentDataGUI("主頁").dispose();
        new ShowStudentDataGUI("主頁").dispose();
    }
}
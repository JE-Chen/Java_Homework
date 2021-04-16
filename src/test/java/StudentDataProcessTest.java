import algorithm.student.StudentData;
import algorithm.student.StudentDataProcess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import java.io.IOException;
import java.util.TreeMap;

public class StudentDataProcessTest {

    private static StudentData<String, TreeMap<String, Integer>, String, Integer>[] studentDataArray;

    @BeforeEach
    public void setUP() {
        studentDataArray = new StudentData[0];
    }

    @Test
    public void testStudentDataProcess() {
        String test = "97501 DS 80 DM 76 LA 63\n" +
                "97502 DS 53 DM 79 LA 98\n" +
                "97523 DS 83 DM 49 LA 78";
        StudentDataProcess studentDataProcess = new StudentDataProcess();
        try {
            studentDataArray = studentDataProcess.processRawString(test);
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentDataArray[0].printStudentData(studentDataArray);
    }

    @Test
    public void testStudentDataProcessWithOnlyStudentNumber() {
        String test = "97501 DS 80 DM 76 LA 63\n" +
                "97502\n" +
                "97523";
        StudentDataProcess studentDataProcess = new StudentDataProcess();
        try {
            studentDataArray = studentDataProcess.processRawString(test);
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentDataArray[0].printStudentData(studentDataArray);
    }

    @Test
    public void testStudentDataProcessWithNullString() {
        String test = "";
        StudentDataProcess studentDataProcess = new StudentDataProcess();
        try {
            studentDataArray = studentDataProcess.processRawString(test);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (studentDataArray.length > 0)
            studentDataArray[0].printStudentData(studentDataArray);
    }
}
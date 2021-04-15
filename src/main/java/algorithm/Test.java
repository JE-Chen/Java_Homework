package algorithm;

import algorithm.student.StudentData;
import algorithm.student.StudentDataProcess;

import java.io.IOException;
import java.util.TreeMap;

public class Test {

    private static StudentData<String, TreeMap<String, Integer>, String, Integer>[] studentDataArray;

    public static void main(String[] argv) throws IOException {
        String test = "97501 DS 80 DM 76 LA 63\n" +
                "97502 DS 53 DM 79 LA 98\n" +
                "97523 DS 83 DM 49 LA 78";
        StudentDataProcess studentDataProcess = new StudentDataProcess();
        studentDataArray = studentDataProcess.processRawString(test);
        studentDataArray[0].printStudentData(studentDataArray);

    }
}

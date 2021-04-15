package algorithm.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class StudentDataProcess {

    private List<String[]> rawStringList = new ArrayList<>();
    private int stringLineCount = 0;
    private StudentData<String, TreeMap<String, Integer>, String, Integer>[] studentDataArray;

    public StudentData<String, TreeMap<String, Integer>, String, Integer>[] processRawString(String rawString) throws IOException {
        String temp;
        Reader stringReader = new StringReader(rawString);
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        while ((temp = bufferedReader.readLine()) != null) {
            rawStringList.add(temp.split(" "));
            stringLineCount++;
        }
        return parseStudentData();
    }

    //TODO Parse student data
    private StudentData<String, TreeMap<String, Integer>, String, Integer>[] parseStudentData() throws IOException {
        String[] rawStringArray;
        studentDataArray = new StudentData[stringLineCount];
        for (int forCount = 0; forCount < stringLineCount; forCount++) {
            TreeMap<String, Integer> treeMap = new TreeMap<>();
            rawStringArray = rawStringList.get(forCount);
            String studentNumber = rawStringArray[0];
            for (int processStudentForInteger = 1; processStudentForInteger < (rawStringArray.length - 1); processStudentForInteger += 2) {
                treeMap.put(rawStringArray[processStudentForInteger], Integer.valueOf(rawStringArray[processStudentForInteger + 1]));
            }
            studentDataArray[forCount] = new StudentData<>(treeMap, studentNumber, "DS");
        }
        return studentDataArray;
    }
}

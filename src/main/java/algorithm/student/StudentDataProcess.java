package algorithm.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class StudentDataProcess<HashMapKey, HashMapValue extends TreeMap<TreeMapKey, TreeMapValue>, TreeMapKey, TreeMapValue> {

    private List<String[]> rawStringList = new ArrayList<>();
    private int stringLineCount = 0;
    private StudentData<HashMapKey, HashMapValue, TreeMapKey, TreeMapValue>[] studentDataArray;

    public StudentData<HashMapKey, HashMapValue, TreeMapKey, TreeMapValue>[] processRawString(String rawString) throws IOException {
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
    public StudentData<HashMapKey, HashMapValue, TreeMapKey, TreeMapValue>[] parseStudentData() throws IOException {
        studentDataArray = new StudentData[stringLineCount];
        for (int forCount = 0; forCount < stringLineCount; forCount++) {
            HashMap<HashMapKey, HashMapValue> hashMap = new HashMap<>();
            TreeMap<TreeMapKey, TreeMapValue> treeMap = new TreeMap<>();
            String[] rawStringArray = rawStringList.get(forCount);
            String studentNumber = rawStringArray[0];
        }
        return null;
    }
}

package Algorithm.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.TreeMap;

public class StudentDataProcess<HashMapKey, HashMapValue extends TreeMap<TreeMapKey, TreeMapValue>, TreeMapKey, TreeMapValue> {

    public int processRawString(String rawString) throws IOException {
        int stringLineCount = 0;
        String temp;
        Reader stringReader = new StringReader(rawString);
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        while ((temp = bufferedReader.readLine()) != null) {
            stringLineCount++;
        }
        return stringLineCount;
    }

    public StudentData<HashMapKey, HashMapValue, TreeMapKey, TreeMapValue> parseStudentData() {
        return null;
    }
}

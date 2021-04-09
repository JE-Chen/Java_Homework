package Algorithm.Sort;

import java.util.HashMap;
import java.util.TreeMap;

public class StudentData<HashMapKey, HashMapValue extends TreeMap<TreeMapKey, TreeMapValue>, TreeMapKey, TreeMapValue>
        implements Comparable<StudentData<HashMapKey, HashMapValue, TreeMapKey, TreeMapValue>> {

    private final String sortUseType;
    private final HashMap<HashMapKey, HashMapValue> studentDataHashMap;

    public StudentData(HashMap<HashMapKey, HashMapValue> studentDataHashMap, String sortUseType) {
        this.studentDataHashMap = studentDataHashMap;
        this.sortUseType = sortUseType;
    }


    public String getData() {
        //TODO Student Data
        return "need to fix";
    }

    @Override
    public int compareTo(StudentData studentData) {
        switch (this.sortUseType) {
            //TODO Compare student data
            case "DS":
                return 0;
            case "DM":
                return 1;
            case "LA":
                return -1;
            case "OS":
                return -2;
            case "EN":
                return -3;

        }
        return 0;
    }

}

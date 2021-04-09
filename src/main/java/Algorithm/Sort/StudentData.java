package Algorithm.Sort;

import java.util.HashMap;

public class StudentData<K,V> implements Comparable<StudentData<K,V>> {


    private final String sortUseType;

    public StudentData(HashMap<K, V> studentDataHashMap, String sortUseType) {
        this.sortUseType = sortUseType;
    }


    public String getData() {
        return "need to fix";
    }

    @Override
    public int compareTo(StudentData studentData) {
        switch (this.sortUseType) {
            case "DS":
                return 0;
            case "DM":
                return 1;
            case "LA":
                return -1;
        }
        return 0;
    }

}

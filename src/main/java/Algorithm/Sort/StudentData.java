package Algorithm.Sort;

import java.util.TreeMap;

public class StudentData<HashMapKey, HashMapValue extends TreeMap<TreeMapKey, TreeMapValue>, TreeMapKey, TreeMapValue>
        implements Comparable<StudentData<HashMapKey, HashMapValue, TreeMapKey, TreeMapValue>> {

    private final TreeMap<TreeMapKey, TreeMapValue> studentTreeMap;
    private final String studentNumber;
    private final String sortUseType;

    public StudentData(TreeMap<TreeMapKey, TreeMapValue> studentTreeMap, String studentNumber, String sortUseType) {
        this.studentTreeMap = studentTreeMap;
        this.studentNumber = studentNumber;
        this.sortUseType = sortUseType;
    }

    public String getData() {
        //TODO Student Data
        return studentNumber + " " + this.studentTreeMap.get("DS");
    }

    @Override
    public int compareTo(StudentData studentData) {
        TreeMap<TreeMapKey, TreeMapValue> temp, temp2;
        int thisCompareGrade = (int) this.studentTreeMap.get("DS"), anotherCompareGrade = (int) studentData.studentTreeMap.get("DS");
        switch (this.sortUseType) {
            //TODO Compare student data
            case "DS":
                thisCompareGrade = (int) this.studentTreeMap.get("DS");
                anotherCompareGrade = (int) studentData.studentTreeMap.get("DS");
                return thisCompareGrade - anotherCompareGrade;
            case "DM":
                thisCompareGrade = (int) this.studentTreeMap.get("DM");
                anotherCompareGrade = (int) studentData.studentTreeMap.get("DM");
                return thisCompareGrade - anotherCompareGrade;
            case "LA":
                thisCompareGrade = (int) this.studentTreeMap.get("LA");
                anotherCompareGrade = (int) studentData.studentTreeMap.get("LA");
                return thisCompareGrade - anotherCompareGrade;
            case "OS":
                thisCompareGrade = (int) this.studentTreeMap.get("OS");
                anotherCompareGrade = (int) studentData.studentTreeMap.get("OS");
                return thisCompareGrade - anotherCompareGrade;
            case "EN":
                thisCompareGrade = (int) this.studentTreeMap.get("EN");
                anotherCompareGrade = (int) studentData.studentTreeMap.get("EN");
                return thisCompareGrade - anotherCompareGrade;

        }
        return thisCompareGrade - anotherCompareGrade;
    }

}

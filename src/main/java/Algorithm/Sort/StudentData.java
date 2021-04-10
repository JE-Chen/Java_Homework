package Algorithm.Sort;

import javax.swing.*;
import java.util.List;
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


    /**
     * @param toPrint   the StudentData we want to print
     */
    public void printStudentData(StudentData<HashMapKey, TreeMap<TreeMapKey, TreeMapValue>, TreeMapKey, TreeMapValue>[] toPrint) {
        for (StudentData<HashMapKey, TreeMap<TreeMapKey, TreeMapValue>, TreeMapKey, TreeMapValue> studentData : toPrint) {
            System.out.println(studentData.getData());
        }
        System.out.println();
    }

    /**
     * @param toPrint   the StudentData we want to print
     * @param jTextArea the textarea we want to show result
     */
    public void printStudentData(StudentData<HashMapKey, TreeMap<TreeMapKey, TreeMapValue>, TreeMapKey, TreeMapValue>[] toPrint, JTextArea jTextArea) {
        for (StudentData<HashMapKey, TreeMap<TreeMapKey, TreeMapValue>, TreeMapKey, TreeMapValue> studentData : toPrint) {
            jTextArea.append(studentData.getData() + "\n");
        }
        jTextArea.append("\n");
    }

    public Integer getSortUseGrade() {
        return (Integer) this.studentTreeMap.get(this.sortUseType);
    }

    public String getData() {
        return studentNumber + " " + this.studentTreeMap.get(this.sortUseType);
    }

    public String getAllData() {
        //TODO Student Data
        return studentNumber + " " + this.studentTreeMap.get(this.sortUseType);
    }

    public int getCompare(int thisCompareGrade, int anotherCompareGrade) {
        return thisCompareGrade - anotherCompareGrade;
    }

    @Override
    public int compareTo(StudentData studentData) {
        int thisCompareGrade = (int) this.studentTreeMap.get(this.sortUseType), anotherCompareGrade = (int) studentData.studentTreeMap.get(studentData.sortUseType);
        switch (this.sortUseType) {
            //TODO Compare student data
            case "DS":
            case "DM":
            case "LA":
            case "OS":
            case "EN":
                return getCompare(thisCompareGrade, anotherCompareGrade);
        }
        return getCompare(thisCompareGrade, anotherCompareGrade);
    }

}

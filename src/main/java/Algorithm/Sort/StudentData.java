package Algorithm.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class StudentData implements Comparable<StudentData> {

    private int studentNumber;
    private String subject1;
    private int score1;
    private String subject2;
    private int score2;
    private String subject3;
    private int score3;

    public StudentData(int studentNumber, String subject1, int score1) {
        this.studentNumber = studentNumber;
        this.subject1 = subject1;
        this.score1 = score1;
    }

    public int getScore1() {
        return this.score1;
    }

    public int getScore2() {
        return this.score2;
    }

    public int getScore3() {
        return this.score3;
    }

    public String getData() {
        return String.format("%d %s %d", studentNumber, subject1, score1);
    }

    @Override
    public int compareTo(StudentData studentData) {
        return this.getScore1() - studentData.getScore1();
    }

    public static void main(String[] argv) {
        ArrayList<StudentData> studentDataArrayList = new ArrayList<>();
        studentDataArrayList.add(new StudentData(1, "DS", 30));
        studentDataArrayList.add(new StudentData(2, "DS", 40));
        studentDataArrayList.add(new StudentData(3, "DS", 55));
        Collections.sort(studentDataArrayList);
        for (StudentData studentData : studentDataArrayList) {
            System.out.println(studentData.getScore1());
        }
    }
}

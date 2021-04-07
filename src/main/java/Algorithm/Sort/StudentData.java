package Algorithm.Sort;

public class StudentData implements Comparable<StudentData> {

    private int studentNumber;
    private String subject1;
    private int score1;
    private String subject2;
    private int score2;
    private String subject3;
    private int score3;
    private String sortUseType;

    public StudentData(int studentNumber,
                       String subject1, int score1,
                       String subject2, int score2,
                       String subject3, int score3,
                       String sortUseType) {
        this.studentNumber = studentNumber;
        this.subject1 = subject1;
        this.score1 = score1;
        this.subject2 = subject2;
        this.score2 = score2;
        this.subject3 = subject3;
        this.score3 = score3;
        this.sortUseType = sortUseType;
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
        return String.format("%d %s %d %s %d %s %d sort using : %s",
                studentNumber,
                subject1, score1,
                subject2, score2,
                subject3, score3,
                sortUseType);
    }

    @Override
    public int compareTo(StudentData studentData) {
        switch (this.sortUseType) {
            case "DS":
                return this.getScore1() - studentData.getScore1();
            case "DM":
                return this.getScore2() - studentData.getScore2();
            case "LA":
                return this.getScore3() - studentData.getScore3();
        }
        return this.getScore1() - studentData.getScore1();
    }

}

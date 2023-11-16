public class Student {
    private final int studentId;
    private final String studentName;
    private final double mathScore;
    private final double physicsScore;
    private final double chemistryScore;
    static int studentIdIncrement = 1;
    private final double averageScore;

    public Student(String studentName, double mathScore, double physicsScore, double chemistryScore) {
        this.studentId = studentIdIncrement;
        this.studentName = studentName;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.averageScore = (mathScore+physicsScore+chemistryScore)/3;
        studentIdIncrement++;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }


    public double getMathScore() {
        return mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public double getAverageScore() {
        return averageScore;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", mathScore=" + mathScore +
                ", physicsScore=" + physicsScore +
                ", chemistryScore=" + chemistryScore +
                '}';
    }
}

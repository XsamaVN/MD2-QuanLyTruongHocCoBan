public class Teacher {
    private final int teacherId;
    private final String teacherName;
    private final String teachSubject;
    private final double salary;
    static int teacherIdIncrement = 1;

    public Teacher(String teacherName, String teachSubject, double salary) {
        this.teacherId = teacherIdIncrement;
        this.teacherName = teacherName;
        this.teachSubject = teachSubject;
        this.salary = salary;
        teacherIdIncrement++;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public static int getTeacherIdIncrement() {
        return teacherIdIncrement;
    }

    public static void setTeacherIdIncrement(int teacherIdIncrement) {
        Teacher.teacherIdIncrement = teacherIdIncrement;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeachSubject() {
        return teachSubject;
    }


    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teachSubject='" + teachSubject + '\'' +
                ", salary=" + salary +
                '}';
    }
}

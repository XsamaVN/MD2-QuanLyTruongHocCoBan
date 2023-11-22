import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteRead {

    public static void writeStudent(String path, List<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "id, name, math score, physics score, chemistry score \n";
        for (Student s : students) {
            str += s.getStudentId() + ", " + s.getStudentName() + ", " + s.getMathScore() + ", " + s.getPhysicsScore() + ", " + s.getChemistryScore() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void writeTeacher(String path, List<Teacher> teacher) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "id, name, teach subject, salary \n";
        for (Teacher t : teacher) {
            str += t.getTeacherId() + ", " + t.getTeacherName() + ", " + t.getTeachSubject() + ", " + t.getSalary() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Student> readStudent(String path) throws IOException {
        List<Student> list = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine()) != null) {
            String[] value = content.split(",");
            int studentId = Integer.parseInt(value[0]);
            String studentName = value[1];
            double mathScore = Double.parseDouble(value[2]);
            double physicsScore = Double.parseDouble(value[3]);
            double chemistryScore = Double.parseDouble(value[4]);
            list.add(new Student(studentName,mathScore,physicsScore,chemistryScore));
        }
        bufferedReader.close();
        fileReader.close();
        return list;
    }

    public static List<Teacher> readTeacher(String path) throws IOException {
        List<Teacher> teacherList = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine()) != null) {
            String[] value = content.split(",");
            int teacherId = Integer.parseInt(value[0]);
            String teacherName = value[1];
            String teachSubject = value[2];
            double salary = Double.parseDouble(value[3]);
            teacherList.add(new Teacher(teacherName,teachSubject,salary));

        }
        bufferedReader.close();
        fileReader.close();
        return teacherList;
    }
}

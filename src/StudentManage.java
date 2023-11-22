import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManage implements IntefaceManage<Student>{
    List<Student> studentList =new ArrayList<>();
    static int studentIdIncrement = 1;

    public StudentManage() throws IOException {
        studentList = WriteRead.readStudent("student.csv");
    }

    public static int getStudentIdIncrement() {
        return studentIdIncrement ++;
    }

    public static void setStudentIdIncrement(int studentIdIncrement) {
        StudentManage.studentIdIncrement = studentIdIncrement;
    }

    @Override
    public void addNew(Student student) {
        studentList.add(student);

    }

    @Override
    public void edit(int id, Student student) {
        int indexEdit = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == id) {
                indexEdit = i;
            }
        }
        if (indexEdit != -1) {
            System.out.println("Sửa thông tin học sinh có id " + id);
            studentList.set(indexEdit, student);
        } else {
            System.out.println("Không tìm thấy thông tin học sinh có id " + id + "\nVui lòng nhập lại!!!");
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public void delete(int id) {
        int indexDelete = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == id) {
                indexDelete = i;
            }
        }
        if (indexDelete != -1) {
            studentList.remove(indexDelete);
            System.out.println("Xóa thành công thông tin học sinh có id " + id);
        } else {
            System.out.println("Không tìm thấy thông tin học sinh có id " + id + "\n Vui lòng nhập lại");
        }

    }

    @Override
    public void showList() throws IOException {
        for (Student s: studentList) {
            System.out.println(s);
        }

    }
    public void showAvarageScoreList(){
        for (Student student : studentList) {
            System.out.println("{Thứ tự: " + student.getStudentId() + ", Tên: " + student.getStudentName() + ", Điểm trung bình: " + student.getAverageScore() + " }");
        }
    }
    public void listExcellentStudents(){
        boolean check = false;
        System.out.println("Danh sách học sinh giỏi: ");
        for (Student student: studentList) {
            if(student.getAverageScore() > 8.5){
                if(student.getMathScore()>=8 && student.getChemistryScore()>=8 && student.getPhysicsScore()>=8){
                    System.out.println( "Tên "+ student.getStudentName()+ ", Điểm trung bình: " + student.getAverageScore());
                    check = true;
                }
            }
        }
        if (!check){
            System.out.println("Không có học sinh giỏi nào!!!");
        }
    }
    public void showAcademicAbility(){
        for (Student student: studentList) {
            if(student.getAverageScore() < 5 || student.getMathScore() < 5 || student.getPhysicsScore() < 5 || student.getChemistryScore() <5){
                System.out.println(" Học sinh { " + student.getStudentName() + " } Đã Trượt");
            }
            else {
                System.out.println(" Học sinh { " + student.getStudentName() + " } được lên lớp");
            }
        }
    }
}

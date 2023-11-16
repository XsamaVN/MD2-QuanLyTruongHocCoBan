import java.util.ArrayList;
import java.util.List;

public class StudentManage implements IntefaceManage<Student>{
    List<Student> studentList = new ArrayList<>();

    public StudentManage() {
        studentList.add(new Student("Có", 8,9,10));
        studentList.add(new Student("Cái", 7.5,9.5,10));
        studentList.add(new Student("Gì", 4,9,8));
        studentList.add(new Student("Đâu", 8,5,7.5));
        studentList.add(new Student("Mà", 8.5,8.5,9));
        studentList.add(new Student("Haizz", 10,10,10));

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
    public void showList() {
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

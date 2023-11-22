import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TeacherManage implements IntefaceManage<Teacher>{
    List<Teacher> teacherList = new ArrayList<>();


    public TeacherManage() throws IOException {
      teacherList = WriteRead.readTeacher("teacher.csv");
    }

    @Override
    public void addNew(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void edit(int id, Teacher teacher) {
        int indexEdit = -1;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getTeacherId() == id) {
                indexEdit = i;
            }
        }
        if (indexEdit != -1) {
            System.out.println("Sửa thông tin giáo viên có id " + id);
            teacherList.set(indexEdit, teacher);
        } else {
            System.out.println("Không tìm thấy thông tin giáo viên có id " + id + "\nVui lòng nhập lại!!!");
        }
    }

    @Override
    public void delete(int id) {
        int indexDelete = -1;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getTeacherId() == id) {
                indexDelete = i;
            }
        }
        if (indexDelete != -1) {
            teacherList.remove(indexDelete);
            System.out.println("Xóa thành công thông tin giáo viên có id " + id);
        } else {
            System.out.println("Không tìm thấy thông tin giáo viên có id " + id + "\n Vui lòng nhập lại");
        }
    }

    @Override
    public void showList() {
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }
    public void searchBySubject(String subject){
        for (Teacher teacher: teacherList) {
            if(teacher.getTeachSubject().equals(subject)){
                System.out.println(teacher);
            }
        }
    }

    public void showListSortBySalary(){
        List<Teacher> teacherListSort = new LinkedList<>(teacherList);
        teacherListSort.sort(Comparator.comparingDouble(Teacher::getSalary));
        for (Teacher teacher: teacherListSort) {
            System.out.println(teacher);
        }
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Không hợp lệ vui lòng chọn lại.");
            System.out.println(" ___________________________________");
            return false;
        }
    }
}

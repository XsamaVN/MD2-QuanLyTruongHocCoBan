import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TeacherManage teacherManage = new TeacherManage();
        StudentManage studentManage = new StudentManage();
        Scanner number = new Scanner(System.in);
        Scanner word = new Scanner(System.in);
        String choice = "1";
        if (teacherManage.isInteger(choice)) {
            while (!choice.equals("0")) {
                System.out.println(" ======= Menu quản lý Trường học ====== \n" +
                                   "|--------------------------------------|\n" +
                                   "|1. Quản lý học sinh                   |\n" +
                                   "|2. Quản lý giáo viên                  |\n" +
                                   "|0. Thoát.                             |\n" +
                                   "|______________________________________|");
                System.out.print("Chọn:   ");
                choice = word.nextLine();
                switch (choice){
                    case "1":
                        String choice1 = "1";
                        while (!choice1.equals("0")) {
                            System.out.println(" ========= Menu quản lý học sinh ========\n" +
                                    "|----------------------------------------|\n" +
                                    "|1. Thêm học sinh.                       |\n" +
                                    "|2. Sửa thông tin học sinh.              |\n" +
                                    "|3. Xóa thông tin học sinh               |\n" +
                                    "|4. Xem toàn bộ danh sách hoc sinh       |\n" +
                                    "|5. Hiện danh sách tên và điểm trung bình|\n" +
                                    "|6. Hiện danh sách học sinh giỏi.        |\n" +
                                    "|7. Hiện danh sách trạng thái học sinh   |\n" +
                                    "|0. Thoát.                               |\n" +
                                    "|________________________________________|");
                            System.out.print("Chọn:   ");
                            choice1 = word.nextLine();
                            switch (choice1){
                                case "1":
                                    System.out.println("---Nhập thông tin học sinh---\n" +
                                            "Nhập tên học sinh: ");
                                    String studentNameAdd = word.nextLine();
                                    System.out.println("Nhập điểm toán: ");
                                    double mathScoreAdd = number.nextDouble();
                                    System.out.println("Nhập điểm lý: ");
                                    double physicsScoreAdd = number.nextDouble();
                                    System.out.println("Nhập điểm hóa: ");
                                    double chemistryScoreAdd = number.nextDouble();
                                    studentManage.addNew(new Student(studentNameAdd, mathScoreAdd, physicsScoreAdd, chemistryScoreAdd));
                                    System.out.println("thêm thông tin giáo viên thành công!!!");
                                    System.out.println("_____________________________________");
                                    break;
                                case "2":
                                    System.out.println("Nhập id học sinh muốn sửa:");
                                    int studentId = number.nextInt();
                                    System.out.println("Nhập tên mới: ");
                                    String studentNameEdit = word.nextLine();
                                    System.out.println("Nhập điểm toán mới: ");
                                    double mathScoreEdit = number.nextDouble();
                                    System.out.println("Nhập điểm lý mới: ");
                                    double physicsScoreEdit = number.nextDouble();
                                    System.out.println("Nhập điểm hóa mới: ");
                                    double chemistryScoreEdit = number.nextDouble();
                                    studentManage.edit(studentId, new Student(studentNameEdit, mathScoreEdit, physicsScoreEdit, chemistryScoreEdit));
                                    System.out.println(" ___________________________________");
                                    break;
                                case "3":
                                    System.out.println("Nhập id học sinh muốn xóa:");
                                    int studentIdDelete = number.nextInt();
                                    studentManage.delete(studentIdDelete);
                                    System.out.println(" ___________________________________");
                                    break;
                                case "4":
                                    System.out.println("Thông tin toàn bộ học sinh: ");
                                    studentManage.showList();
                                    System.out.println(" ___________________________________");
                                    break;
                                case "5":
                                    System.out.println("Danh sách điểm trung bình: ");
                                    studentManage.showAvarageScoreList();
                                    System.out.println(" ___________________________________");
                                    break;
                                case "6":
                                    System.out.println("Danh sách học sinh giỏi:");
                                    studentManage.listExcellentStudents();;
                                    System.out.println(" ___________________________________");
                                    break;
                                case "7":
                                    System.out.println("Danh sách trạng thái học sinh: ");
                                    studentManage.showAcademicAbility();
                                    System.out.println(" ___________________________________");
                                    break;
                                default:
                                    System.out.println("Chọn không hợp lệ vui lòng chọn lại");
                            }
                        }
                        break;
                    case "2":
                        String choice2 = "1";
                        while (!choice2.equals("0")) {
                            System.out.println(" ========= Menu quản lý giáo viên ==========\n" +
                                               "|-------------------------------------------|\n" +
                                               "|1. Thêm giáo viên.                         |\n" +
                                               "|2. Sửa thông tin giáo viên                 |\n" +
                                               "|3. Xóa thông tin giáo viên                 |\n" +
                                               "|4. Xem toàn bộ danh sách giáo viên         |\n" +
                                               "|5. Tìm giáo viên theo môn học              |\n" +
                                               "|6. Danh sách giáo viên sắp xếp theo lương  |\n" +
                                               "|0. Thoát.                                  |\n" +
                                               "|___________________________________________|");
                            System.out.print("Chọn:   ");
                            choice2 = word.nextLine();
                            switch (choice2){
                                case "1":
                                    System.out.println("---Nhập thông tin giáo viên---\n" +
                                            "Nhập tên giáo viên: ");
                                    String teacherNameAdd = word.nextLine();
                                    System.out.println("Nhập môn học: ");
                                    String teacherSubjectAdd = word.nextLine();
                                    System.out.println("Nhập lương: ");
                                    double teacherSalaryAdd = number.nextDouble();
                                    teacherManage.addNew(new Teacher(teacherNameAdd, teacherSubjectAdd, teacherSalaryAdd));
                                    System.out.println("thêm thông tin giáo viên thành công!!!");
                                    System.out.println("_____________________________________");
                                    break;
                                case "2":
                                    System.out.println("Nhập id giáo viên muốn sửa:");
                                    int teacherId = number.nextInt();
                                    System.out.println("Nhập tên mới: ");
                                    String teacherNameEdit = word.nextLine();
                                    System.out.println("Nhập môn học mới: ");
                                    String teacherSubjectEdit = word.nextLine();
                                    System.out.println("Nhập lương mới: ");
                                    double teacherSalaryEdit = number.nextDouble();
                                    teacherManage.edit(teacherId, new Teacher(teacherNameEdit, teacherSubjectEdit, teacherSalaryEdit));
                                    System.out.println(" ___________________________________");
                                    break;
                                case "3":
                                    System.out.println("Nhập id giáo viên muốn xóa:");
                                    int teacherIdDelete = number.nextInt();
                                    teacherManage.delete(teacherIdDelete);
                                    System.out.println(" ___________________________________");
                                    break;
                                case "4":
                                    System.out.println("Thông tin toàn bộ giáo viên: ");
                                    teacherManage.showList();
                                    System.out.println(" ___________________________________");
                                    break;
                                case "5":
                                    System.out.println("Tìm giáo viên theo môn học ");
                                    String subjectSearch = word.nextLine();
                                    teacherManage.searchBySubject(subjectSearch);
                                    System.out.println(" ___________________________________");
                                    break;
                                case "6":
                                    System.out.println("Danh sách giáo viên sắp xếp theo lương:");
                                    teacherManage.showListSortBySalary();
                                    System.out.println(" ___________________________________");
                                    break;
                                case "0":
                                    break;
                                default:
                                    System.out.println("Chọn không hợp lệ vui lòng chọn lại");

                            }
                        }
                        break;
                }
            }
        }

    }
}
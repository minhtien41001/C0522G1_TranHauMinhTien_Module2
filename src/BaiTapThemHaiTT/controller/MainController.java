package BaiTapThemHaiTT.controller;

import ss10_dsa_danhsach.bai_tap.mvc.controller.StudentController;
import ss10_dsa_danhsach.bai_tap.mvc.controller.TeacherController;

import java.util.Scanner;

public class MainController {
    private Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    TeacherController teacherController = new TeacherController();

    public void menuMain(){
        do{
            System.out.println("=====CHÀO MỪNG BẠN ĐẾN VỚI CODEGYM ĐÀ NẴNG====");
            System.out.println("1.Quản lý giảng viên");
            System.out.println("2.Quản lý học viên");
            System.out.println("3.Thoát chương trình");
            System.out.println("Nhập lựa chọn của bạn");
            System.out.print("Nhập chức năng bạn cần sử dụng :");
            int choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>3){
                System.out.println("Không tồn tại chức năng này mời bạn nhập lại!!!!");
                continue;
            }
            switch (choose){
                case 1:
                    teacherController.menuTeacher();
                    break;
                case 2:
                    studentController.menuStudent();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);
    }
}

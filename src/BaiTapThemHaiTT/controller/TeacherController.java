package BaiTapThemHaiTT.controller;

import ss10_dsa_danhsach.bai_tap.mvc.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public void menuTeacher (){
        Scanner scanner = new Scanner(System.in);
        TeacherService teacherService = new TeacherService();
        do {
            System.out.println("****************CHỨC NĂNG QUẢN LÝ GIẢNG VIÊN **********************");
            System.out.println("1.Thêm giảng viên mới");
            System.out.println("2.Hiển thị danh sách giảng viên");
            System.out.println("3.Xóa giảng viên theo ID");
            System.out.println("4.Tìm giảng viên theo tên");
            System.out.println("5.Tìm giảng viên theo id");
            System.out.println("6.Sắp xếp giảng viên theo tên");
            System.out.println("7.Quay lại menu chính.");
            System.out.print("Mời bạn chọn chức năng :");
            int choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>7){
                System.out.println("Không có chức năng này , mời bạn nhập lại!!!");
                continue;
            }
            switch (choose){
                case 1:
                    teacherService.addElement();
                    break;
                case 2:
                    teacherService.disPlay();
                    break;
                case 3:
                    teacherService.removeById();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    return;
            }
        }while (true);

    }
}

package ss10_dsa_danhsach.bai_tap.mvc.controller;

import ss10_dsa_danhsach.bai_tap.mvc.service.IStudentService;
import ss10_dsa_danhsach.bai_tap.mvc.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("1. Thêm mới học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Xem danh sách học sinh \n" +
                    "4. Tìm học sinh theo ID \n" +
                    "5. Tìm học sinh theo tên \n" +
                    "6. Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.findById();
                    break;
                case 5:
                    iStudentService.findByName();
                    break;
                case 6:
                    return;
            }
        }while (true);
    }
}

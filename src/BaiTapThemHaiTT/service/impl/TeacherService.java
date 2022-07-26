package BaiTapThemHaiTT.service.impl;

import BaiTapThemHaiTT.model.Teacher;
import BaiTapThemHaiTT.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Them moi thanh cong! ");

    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhap ID can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Teacher teacher : teacherList){
            if (teacher.getId() == idRemove){
                System.out.println("Ban co chac muon xoa khong?\n " +
                        "1. co \n" +
                        "2. khong");
                int chosseYesNo = Integer.parseInt(scanner.nextLine());
                if (chosseYesNo == 1){
                    teacherList.remove(teacher);
                    System.out.println("Xoa thanh cong");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("Khong tim tahy ID nay");
        }
    }

    @Override
    public void displayAllTeacher() {

    }

    public  static Teacher infoTeacher(){

    }
}

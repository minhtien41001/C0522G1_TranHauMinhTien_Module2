package BaiTapThemHaiTT.service.impl;

import BaiTapThemHaiTT.model.Student;
import BaiTapThemHaiTT.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Them moi thanh cong");
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhap id an xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFLag = false;

        for (Student student : studentList){
            if (student.getId() == idRemove){
                System.out.println("Ban co chac la muon xoa khong ? \n" +
                        "1. co \n" +
                        "2. khong");
                int chosseYesNo = Integer.parseInt(scanner.nextLine());
                if (chosseYesNo == 1){
                    studentList.remove(student);
                    System.out.println("Xoa thanh cong");
                }
                isFLag = true;
                break;
            }
        }
        if (!isFLag){
            System.out.println("Khong tim thay ID nay");
        }
    }

    @Override
    public void displayALlStudent() {
        for (Student student : studentList){
            System.out.println(student);
        }
    }

    @Override
    public void findById() {
        System.out.println("Nhap Id can tim: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++){
            if (id == studentList.get(i).getId()){
                System.out.println(studentList.get(i).toString());
                break;
            }
        }
    }

    @Override
    public void findByName() {
        System.out.println("Nhap ten can tim: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (Student student : studentList){
            if (student.getName().contains(name)){
                System.out.println(student);
                flag = true;
            }
        }
        if (!flag){
            System.err.println("Khong tim thay!");
        }
    }

    public static Student infoStudent(){
        System.out.println("Nhap ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.println("Nhap ngay sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();

        System.out.println("Nhap ten lop: ");
        String nameClass = scanner.nextLine();

        System.out.println("Nhap diem: ");
        double score = scanner.nextDouble();

        Student student = new Student(id,name,dateOfBirth,sex,nameClass,score);
        return student;
    }
}

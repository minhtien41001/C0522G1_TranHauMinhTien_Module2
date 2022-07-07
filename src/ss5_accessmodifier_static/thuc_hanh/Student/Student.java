package ss5_accessmodifier_static.bai_tap.student;

public class Student {
    private int rollno;
    private String name;
    private static String college = "Bách Khoa Đà Nẵng";

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

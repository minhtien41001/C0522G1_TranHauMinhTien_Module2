package ss5_accessmodifier_static.bai_tap.student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(123,"Tiến");
        Student s2 = new Student(456,"Bảo");
        Student s3 = new Student(789,"Tân");

        s1.display();
        s2.display();
        s3.display();
    }
}

package ss6_iheritance.thuc_hanh.shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("Yellow",false,3.5);
        System.out.println(circle);
    }
}

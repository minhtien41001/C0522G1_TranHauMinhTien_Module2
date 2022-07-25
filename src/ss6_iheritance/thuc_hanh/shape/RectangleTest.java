package ss6_iheritance.thuc_hanh.shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.5,6.0);
        System.out.println(rectangle);

        rectangle = new Rectangle("blue",false,6.5,7.0);
        System.out.println(rectangle);
    }
}

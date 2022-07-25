package ss6_iheritance.thuc_hanh.shape;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4.5);
        System.out.println(square);

        square = new Square("yellow",false,5.0);
        System.out.println(square);
    }
}

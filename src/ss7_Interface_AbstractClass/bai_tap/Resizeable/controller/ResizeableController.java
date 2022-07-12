package ss7_Interface_AbstractClass.bai_tap.Resizeable.controller;

import ss7_Interface_AbstractClass.bai_tap.Resizeable.model.Circle;
import ss7_Interface_AbstractClass.bai_tap.Resizeable.model.Rectangle;
import ss7_Interface_AbstractClass.bai_tap.Resizeable.model.Shape;
import ss7_Interface_AbstractClass.bai_tap.Resizeable.model.Square;

public class ResizeableController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10.0, "red", true);
        shapes[1] = new Rectangle(20.0, 16.7, "pink", false);
        shapes[2] = new Square(4.0, "pink", true);


        double percent =Math.floor(Math.random() * 100) ;
        System.out.println("Trước khi thay đổi: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Diện tích: %.2f ", shape.getArea());
            System.out.println();
        }
        System.out.println();
        System.out.println("Percent: " + percent + "%");
        System.out.println();

        System.out.println("Sau khi thay đổi kích thước: ");
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape);
            System.out.printf("Diện tích: %.2f ", shape.getArea());
            System.out.println();
        }
    }
}

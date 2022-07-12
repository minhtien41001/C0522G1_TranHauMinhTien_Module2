package ss7_Interface_AbstractClass.bai_tap.Colorable.controller;

import ss7_Interface_AbstractClass.bai_tap.Resizeable.model.Circle;
import ss7_Interface_AbstractClass.bai_tap.Resizeable.model.Rectangle;
import ss7_Interface_AbstractClass.bai_tap.Resizeable.model.Shape;
import ss7_Interface_AbstractClass.bai_tap.Resizeable.model.Square;

public class MainController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle();
        shapes[1]= new Square(2);
        shapes[2]= new Circle(10);
        shapes[3]=new Square();

        for(Shape shape :shapes){
            if(shape instanceof  Square){
                shape.howToColor();
                System.out.println("--------------");
            }
        }
    }
}

package ss6_iheritance.bai_tap.Circle_Cylinder.controller.Controller;

import ss6_iheritance.bai_tap.Circle_Cylinder.controller.model.Circle;
import ss6_iheritance.bai_tap.Circle_Cylinder.controller.model.Cylinder;

public class TestController {
    public static void main(String[] args) {
        Circle circle=new Circle(3,"red");
        Circle circle1=new Cylinder(3,"blue",5);
        System.out.println(circle);
        System.out.println("Diện tích hình tròn: "+  circle.getArea());
        System.out.println(circle1);
        System.out.println("Thể tích hình trụ: "+  ((Cylinder)circle1).getVolume());
    }
}

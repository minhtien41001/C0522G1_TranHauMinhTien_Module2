package ss6_iheritance.bai_tap.exrcise3.Controller;

import ss6_iheritance.bai_tap.exrcise3.model.MoveablePoint;
import ss6_iheritance.bai_tap.exrcise3.model.Point;
import java.awt.*;
import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(3,4);
        System.out.println(point);

        System.out.print("Thay dổi giá trị x và y :");
        point.setXY(9,9);
        System.out.println(Arrays.toString(point.getXY()));

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(1,1);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);

        System.out.print("Thay đổi x và y của moveablePoint :");
        moveablePoint.setXY(10,11);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}

package ss4_oop.thuc_hanh;

import java.awt.*;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the width: ");
            double width = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double height = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(width,height);
            System.out.println("Your Rectangle: \n " + rectangle.Display());
            System.out.println("Area of the Rectangle: " + rectangle.Area());
            System.out.println("Perimeter of the Rectangle: " + rectangle.Perimeter());
        }
    }


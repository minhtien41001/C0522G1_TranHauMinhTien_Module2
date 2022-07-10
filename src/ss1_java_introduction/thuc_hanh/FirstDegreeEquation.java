package ss1_java_introduction.thuc_hanh;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Cho phuong trinh 'a * x + b = c',Hay nhap hang so: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0 ) {
            double answer = (c -b) / a;
            System.out.printf("Nghiem cua phuong trinh la x= %f!" , answer);
        }else{
            if (a == 0){
                System.out.print("Phuong trinh co vo so nghiem");
            }else{
                System.out.print("Phuong trinh vo nghiem");
            }
        }

    }
}

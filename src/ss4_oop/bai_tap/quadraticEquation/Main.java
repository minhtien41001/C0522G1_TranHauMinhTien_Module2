package ss4_oop.bai_tap.quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        do {
            System.out.println("Nhập a: ");
            a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("a phải khác 0,mời bạn nhập lại:");
            }
        } while (a == 0);
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.printf("Phương trình có 2 nghiệm  %f và %f", quadraticEquation.getRoot1(),quadraticEquation.getRoot2());
        }else if (delta==0){
                System.out.printf("Phương trình có nghiệm kép %f",quadraticEquation.getRoot1());
            }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
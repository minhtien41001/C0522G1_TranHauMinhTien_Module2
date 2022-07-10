package ss1_java_introduction.thuc_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        width = sc.nextFloat();
        System.out.println("Nhap chieu dai");
        height = sc.nextFloat();
        float Area = width * height;
        System.out.println("Dien tich la: "+ Area);
    }
}

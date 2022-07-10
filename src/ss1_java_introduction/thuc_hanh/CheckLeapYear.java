package ss1_java_introduction.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm muốn kiểm tra: ");
        int year = scanner.nextInt();
        if (year % 4 ==0){
            if (year % 100 !=0){
                System.out.printf( " %d là năm nhuận ", year);
            }else {
                System.out.printf( "%d không phải là năm nhuận ",year);
            }
        }
        if (year % 100 ==0){
            if (year % 400 ==0){
                System.out.printf("%d là năm nhuận",year);
            }else {
                System.out.printf("%d không phải là năm nhuận",year);
            }
        }

    }
}

package ss2_vonglapJava.thuc_hanh;

import java.util.Enumeration;
import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int Number = scanner.nextInt();
        if (Number < 2){
            System.out.println(Number + " là số nguyên tố");
        }
        int i = 2;
        boolean check = true;
        while (i <= Math.sqrt(Number)){
            if (Number % i ==0){
                check = false;
                break;
            }
            i++;
        }
        if (check){
            System.out.println(Number + " là số nguyên tố");
        }
        else {
            System.out.println(Number + " không phải là số nguyên tố");
        }
    }
}


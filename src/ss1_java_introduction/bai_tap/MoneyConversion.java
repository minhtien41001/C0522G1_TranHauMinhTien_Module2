package ss1_java_introduction.bai_tap;

import java.util.Scanner;

public class MoneyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền: ");
        usd = scanner.nextDouble();
        double convert = usd * 23000;
        System.out.print("Giá trị VNĐ: " + convert);
    }
}

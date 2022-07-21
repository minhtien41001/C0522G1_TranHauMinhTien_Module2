package ss15_exception_debug.thuc_hanh;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc nhất");
        System.out.println("Phương trình có dạng 'a * x + b = 0',Mời bạn nhập hằng số: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a !=0){
            double solution = -b / a;
            System.out.printf("Nghiệm của phương trình là: %f",solution );
        }
        else {
            if (b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}

package ss2_vonglapJava.bai_tap;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            int divisor = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.println(number);
            }
            number ++;
        }
    }
}
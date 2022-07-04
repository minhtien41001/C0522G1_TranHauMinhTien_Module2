package ss2_vonglapJava.bai_tap;

public class PrimeNumberDisplay {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 20){
            int divisor = 0;
            for (int i = 1; i<= number;i++) {
                if (number % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 2){
                System.out.println(number);
                count++;
            } number++;
        }
    }
}

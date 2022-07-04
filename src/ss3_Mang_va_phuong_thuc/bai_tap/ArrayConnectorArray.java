package ss3_Mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConnectorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng 1: ");
        int oneLength = scanner.nextInt();
        int [] arrayOne = new int[oneLength];
        for (int i = 0; i< oneLength; i++){
            System.out.println("arr[" + i + "] =");
                arrayOne[i] = scanner.nextInt();
        }
        System.out.println("Mảng thứ nhất; ");
        System.out.println(Arrays.toString(arrayOne));

        System.out.println("Nhập số phần tử của mảng thứ 2: ");
        int twoLength = scanner.nextInt();
        int[] arrayTwo = new int[twoLength];
        for (int i = 0; i < twoLength; i++){
            System.out.println("arr["+ i + "]= ");
                arrayTwo[i] = scanner.nextInt();
        }
        System.out.println("Mảng thứ 2: ");
        System.out.println(Arrays.toString(arrayTwo));

        int[] arrayThree = new int[oneLength + twoLength];
        for (int i = 0; i< arrayOne.length;i++){
            arrayThree[i] = arrayOne[i];
        }
        for (int j = 0;j < arrayTwo.length;j++ ){
            arrayThree[arrayOne.length +j] = arrayTwo[j];
        }
        System.out.println("\n Mảng gộp: ");
        System.out.println(Arrays.toString(arrayThree));

    }
}

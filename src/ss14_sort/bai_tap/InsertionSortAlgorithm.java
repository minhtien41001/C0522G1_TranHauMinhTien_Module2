package ss14_sort.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int lengthArr = Integer.parseInt(scanner.nextLine());

        int [] arr = new int[lengthArr ];

        for (int i = 0; i < lengthArr ; i++){
            System.out.printf("Nhập phần tử arr[%d] của mảng: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arr));

        inserSort(arr);

        System.out.print("Mảng sau khi sắp xếp là: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void inserSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j;

            for (j = i - 1; j >= 0 && arr[j] > key; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}

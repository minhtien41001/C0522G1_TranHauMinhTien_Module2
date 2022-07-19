package ss_13_search.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Nhập số cần tìm: ");
        int number = scanner.nextInt();

        System.out.println(binarySearch(array,0,array.length - 1,number));
    }

    private static int binarySearch(int[] array, int left, int right, int key) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (array[mid] == key) {
            return mid;
        }

        if (array[mid] < key) {
            return binarySearch(array, mid + 1, right, key);
        }

        return binarySearch(array, left, mid - 1, key);
    }
}

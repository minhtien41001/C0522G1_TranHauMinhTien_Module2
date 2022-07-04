package ss3_Mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int valueDelete;
        System.out.println("Nhập số lượng phần tử");
        int size = sc.nextInt();
        array = new int[size];
        System.out.println("Nhập giá trị các phần tử");
        for (int i = 0; i < array.length; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();
        System.out.print("Nhập phần tử cần xóa :");
        valueDelete = sc.nextInt();

        deleteValue(array, valueDelete);

        System.out.print("Mảng sau khi xóa :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }

    public static void deleteIndex(int arr[], int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void deleteValue(int arr[], int value) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                deleteIndex(arr, i);
                check = true;
                i--;
            }
        }
        if (check == false) {
            System.out.println("Không tìm thấy");
        }
    }
}



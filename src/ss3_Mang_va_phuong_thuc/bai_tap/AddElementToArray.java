package ss3_Mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int valuePush;
        System.out.println("Nhập số lượng phần tử");
        int size = sc.nextInt();
        array = new int[10];
        System.out.println("Nhập giá trị các phần tử");
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();
        System.out.print("Nhập phần tử cần chèn:");
        valuePush= sc.nextInt();
        int indexPush ;
        do {
            System.out.print("Nhập ví trí cần chèn phần tử :");
            indexPush = sc.nextInt();
            if(indexPush<=-1||indexPush>=array.length-1){
                System.out.print("Ví trí không thõa mãn, mời bạn nhập lại!");
            }
        }while(indexPush<=-1||indexPush>=array.length-1);
        pushElement(array,valuePush,indexPush);
        size++;
        System.out.print("Mảng mới :");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static void pushElement(int arr[],int value,int index){
        for (int i = arr.length-1; i >index ; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=value;
    }
}

package ss14_sort.thuc_hanh.practice1;

public class Pratice1 {
    static int[] list = {2,3,2,5,9,-11,8,-7,-16};

    public static void bubbleSort(int[] list){
        boolean isSwap = true;

        for (int i = 1;i < list.length && isSwap;i++){
            isSwap = false;
            for (int j = 0; j < list.length-1;j++){
                if (list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1]  = temp;

                    isSwap = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0;i < list.length;i++){
            System.out.print(list[i] + " ");
        }
    }
}

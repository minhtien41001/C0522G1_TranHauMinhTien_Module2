package ss_13_search.thuc_hanh;

public class Practice1 {
    static int[] list = {2,5,6,8,9,12,16,18,25,39};

    static int binarySearch(int[] list,int key){
    int low = 0;
    int high = list.length - 1;
    while (high >= low){
        int mid = (low + high)/2;
        if (key > list[mid]){
            low = mid + 1;
        }
        else if (key == list[mid]){
            return mid;
        }
        else {
            high = mid - 1;
        }
    }
    return -1;
  }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,6));
        System.out.println(binarySearch(list,8));
        System.out.println(binarySearch(list,12));
        System.out.println(binarySearch(list,25));
        System.out.println(binarySearch(list,39));
    }
}

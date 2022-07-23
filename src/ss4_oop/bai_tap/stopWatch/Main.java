package ss4_oop.bai_tap.stopWatch;

public class Main {
//    public static void main(String[] args) {
//        double []arr=new double[100000];
//        for(int i =0;i<100000;i++){
//            arr[i]=Math.random();
//        }
//        StopWatch stopWatch = new StopWatch();
//        System.out.print("Thời gian bắt đầu ");
//        System.out.println(stopWatch.start());
//
//        for (int i = 0; i <100000 ; i++) {
//            for (int j = i+1; j <100000 ; j++) {
//                if(arr[i]>arr[j]){
//                    double temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.print("Thời gian kết thúc ");
//        System.out.println(stopWatch.stop());
//        System.out.println(stopWatch.getElapsedTime());
//
//    }
//}
       public static void main(String[] args) {
           double []arr = new double[100000];
           for (int i = 0; i<100000;i++){
               arr[i] = Math.random();
           }
           StopWatch stopWatch = new StopWatch();
           System.out.println("Thời gian bắt đầu: ");
           System.out.println(stopWatch.start());

           for (int i= 0;i < 100000;i++){
               for (int j = i + 1;j < 100000;j++){
                   if (arr[i] > arr[j]){
                       double temp = arr[i];
                       arr[i]=arr[j];
                       arr[j] = temp;
                   }
               }
           }
           System.out.println("Thời gian kết thúc: ");
           System.out.println(stopWatch.stop());
           System.out.println("Thời gian đã trôi qua: ");
           System.out.println(stopWatch.getElapsedTime());
       }
}
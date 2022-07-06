package ss4_oop.bai_tap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
        Fan fan1 = new Fan(3,true,10,"red");
        System.out.println(fan1);
        Fan fan2 = new Fan(2,false,5,"blue");
        System.out.println(fan2);
    }
}

package ss5_accessmodifier_static.bai_tap.AccessModifier;

public class TestCircle {
//    public static void main(String[] args) {
//        Circle circle = new Circle(5);
//       double area = circle.getArea();
//        circle.setColor("blue");
//        String color = circle.getColor();
//        System.out.printf("The area of %s circle is %f:",color, area);
//    }
//}
          public static void main(String[] args) {
              Circle circle = new Circle(5);
              double area = circle.Area();
              circle.setColor("blue");
              String color = circle.getColor();
              System.out.printf("Diện tích hình tròn màu %s là %f",color,area);
          }
}
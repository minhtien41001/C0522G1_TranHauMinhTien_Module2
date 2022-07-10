package ss3_Mang_va_phuong_thuc.thuc_hanh;

public class test {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Diện tích của hình tròn có bán kính " + circle1.radius + "là " + circle1.Area());
        Circle circle2 = new Circle(2);
        System.out.println("Diện tích của hình tròn có bán kính " + circle2.radius + "là " + circle2.Area());
    }
}
class Circle {
    double radius;

    Circle() {
    }
    Circle(double radius) {
        this.radius = radius;
    }
    public double Area(){
        return this.radius * this.radius * Math.PI;
    }
}
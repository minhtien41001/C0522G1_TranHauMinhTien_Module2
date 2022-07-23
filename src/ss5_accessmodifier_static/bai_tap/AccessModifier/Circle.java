package ss5_accessmodifier_static.bai_tap.AccessModifier;

public class Circle {
    //    private double radius = 1.0;
//    private String color ="red";
//
//    public Circle(){
//    }
//    public Circle(double radius){
//        this.radius = radius ;
//    }
//    public String getColor(){
//        return color;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//    public double getArea(){
//        return radius * radius * Math.PI;
//    }
//    public void setColor(String color){
//        this.color = color;
//    }
//    public void setRadius( double radius){
//        this.radius = radius;
//    }
//}
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double Area(){
        return radius * radius * Math.PI;
    }
}
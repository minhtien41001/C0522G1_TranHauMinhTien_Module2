package ss7_Interface_AbstractClass.bai_tap.Colorable.model;

public class Circle extends Shape implements Colorable{
    private double radius= 1;
    public Circle(){

    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
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
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }


    @Override
    public String toString() {
        return "A Circle with radius = "
                +getRadius()
                +",which is a subclass of "
                +super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Hình tròn");
    }
}

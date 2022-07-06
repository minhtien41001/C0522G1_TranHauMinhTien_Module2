package ss4_oop.thuc_hanh;

public class Rectangle1 {
    public class Rectangle {
    double width,height;
    public Rectangle(){
    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double Area(){
        return this.width * this.height;
    }
    public double Perimeter(){
        return (this.width + this.height) * 2;
    }
    public String Display(){
        return  "Rectangle{ width = "+ width + ", height = " + height+ "}";
    }
}
}

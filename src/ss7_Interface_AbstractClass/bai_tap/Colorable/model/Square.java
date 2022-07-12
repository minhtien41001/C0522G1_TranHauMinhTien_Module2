package ss7_Interface_AbstractClass.bai_tap.Colorable.model;

public class Square extends Shape implements Colorable{
    private double side =1.0;

    public Square(){

    }
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{"+getSide()
                +super.toString() +"}";
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

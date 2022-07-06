package ss4_oop.bai_tap.quadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return Math.pow(b,2) - 4*a*c;
    }
    public double getRoot1(){
        if (this.getDiscriminant() >0){
            return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        }else if (this.getDiscriminant() == 0){
            return -b/(2*a);
        }else {
            return 0;
        }
    }
    public double getRoot2(){
        if (this.getDiscriminant() >0){
            return (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        }else if (this.getDiscriminant() == 0){
            return -b/(2*a);
        }else {
            return 0;
        }
    }





}

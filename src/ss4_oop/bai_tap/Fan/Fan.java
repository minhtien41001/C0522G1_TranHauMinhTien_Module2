package ss4_oop.bai_tap.Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed;
    private boolean on ;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String getSpeed() {
        if(this.isOn()){
            switch (this.speed){
                case 1:
                    return "fan is on SLOW";
                case 2:
                    return "fan is on MEDIUM";
                case 3:
                    return "fan is on FAST";
            }
        }
        return "fan is off";

    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }


    @Override
    public String toString() {
        if (!this.isOn()){
            return this.getSpeed()+" radius = "+this.radius+" , color = "+this.color;
        }
        return this.getSpeed()+" radius = "+this.radius+" , color = "+this.color;
    }
}

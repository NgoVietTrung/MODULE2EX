package BT4;

public class Fan {
    private final int SLOW=1;
    private final int MEDIUM=2;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    private final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(boolean on, double radius,String color,int speed){
    this.speed=SLOW;
    this.on=false;
    this.radius=5;
    this.color="blue";
    }
    public Fan(boolean on, double radius,String color){
        this.on = on;
        this.radius=radius;
        this.color=color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        if (on==true){
            return  " Speed: "+speed+" color: "+color+" radius: "+radius+" fan is on";
        }else
            return " Speed: "+speed+" color: "+color+" radius: "+radius+" fan is off";
    }
}

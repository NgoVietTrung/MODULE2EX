package BT2;

public class Circle {
    double radius;
    String color;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "A Circle with radius "+radius+" and color is "+color+" and Area= "+getArea();
    }

}

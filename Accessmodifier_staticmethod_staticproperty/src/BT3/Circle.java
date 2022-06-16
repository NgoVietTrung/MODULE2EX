package BT3;

public class Circle {
    private double radius;
    private String color="Red";
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    private double getRadius() {
        return radius;
    }
    private double getArea(){
        return radius*radius*Math.PI;
    }
    public String display(){
        return "Circle: "+"Radius "+radius+" Area: "+getArea();
    }
}

package BT2;

public class Cylinder extends Circle{
    double height;
    public Cylinder(){}
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height, double radius,String color){
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    public String toString() {
        return "A Cynlinder with color is "+super.getColor()+" and bottom surface with radius "+super.getRadius()+" with height "+height+". Area's Cynlinder is "+getVolume();
    }


}

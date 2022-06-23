package BT3;

public class Cylinder {
    public static double getVolume(double radius, double height){
        double Area=getArea(radius);
        double Perimeter=getPerimeter(radius);
        double volume=Area*height+2*Area;
        return volume;
    }
    private static double getArea(double radius){
        return radius*radius*Math.PI;
    }
    private static double getPerimeter(double radius){
        return radius*2*Math.PI;
    }
}

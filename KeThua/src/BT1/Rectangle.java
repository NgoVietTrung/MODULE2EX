package BT1;

public class Rectangle extends Shape{
    double width=1.0;
    double length=1.0;
    public Rectangle(){
    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    public String toString(){
        return "A Rectangle with width "+width+" and length "+length+", which subclass of "+super.toString();
    }

}

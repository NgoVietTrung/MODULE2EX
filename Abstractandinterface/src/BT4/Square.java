package BT4;

public class Square extends Rectangle {
    double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    public String toString() {
        return "A Square with side=" + side + " , which is a subclass of " + super.toString() ;
    }
    public double reSize() {
        double percent = Math.random() * 100 + 1;
        System.out.println(percent+"%");
        return getArea() * ((100 + percent) / 100);
    }
}

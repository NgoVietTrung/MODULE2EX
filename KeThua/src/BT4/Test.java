package BT4;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point point=new Point(3,6);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(3, 6, 1, 8);
        System.out.println(Arrays.toString(movablePoint.getXY()));
        System.out.println(movablePoint.move());
    }
}
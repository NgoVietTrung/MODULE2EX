package BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Width= ");
        double width=scanner.nextDouble();
        System.out.print("Height= ");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
    }
}

package BT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap a ");
        double a=scanner.nextDouble();
        System.out.print("Nhap b ");
        double b=scanner.nextDouble();
        System.out.print("Nhap c ");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.print("x1= "+quadraticEquation.getroot1());
            System.out.println();
            System.out.print("x2= "+quadraticEquation.getroot2());
        } else if ( quadraticEquation.getDiscriminant()==0)
            System.out.print("x= "+ quadraticEquation.getroot());
        else
            System.out.println("The equation has no roots");
    }
}

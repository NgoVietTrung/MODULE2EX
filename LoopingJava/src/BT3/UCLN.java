package BT3;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so a ");
        int a=scanner.nextInt();
        System.out.print("Nhap so b ");
        int b= scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0){
            System.out.println("Khong co uoc chung lon nhat");
        }
        while (a!=b){
            if(a>b){
                a=a-b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN "+ a);
    }
}

package BT7;

import java.util.Scanner;

public class ADD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap do dai cua mang ");
        int length=scanner.nextInt();
        System.out.println("So can chen ");
        int number=scanner.nextInt();
        System.out.println("Vi tri can chen ");
        int index=scanner.nextInt();
        int[] numbers=new int[length];
        if(index>=0&&index<length){
            numbers[index]=number;
        }else {
            System.out.println("Khong chen duoc");
        }
        for (int i:numbers){
            System.out.print( i+" ");
        }
    }
}

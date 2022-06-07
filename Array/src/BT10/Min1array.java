package BT10;

import java.util.Scanner;

public class Min1array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap size ");
        int size=scanner.nextInt();
        int array[]=new int[size];
        int min=Integer.MAX_VALUE;
        for (int i=0;i<size;i++){
            System.out.print("Array["+i+"] ");
            array[i]=scanner.nextInt();
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println("Min "+min);
    }
}

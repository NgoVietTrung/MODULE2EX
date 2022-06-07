package BT9;

import java.util.Scanner;

public class Max2array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("So hang ");
        int sohang=scanner.nextInt();
        System.out.print("So cot ");
        int socot=scanner.nextInt();
        int array[][]=new int[sohang][socot];
        int max=Integer.MIN_VALUE;
        for (int i=0;i<sohang;i++){
            for (int j=0;j<socot;j++){
                System.out.print("Array["+i+"]["+j+"]");
                array[i][j]=scanner.nextInt();
                if(max<array[i][j]){
                    max=array[i][j];
                }
            }
        }
        System.out.print("Gia tri lon nha "+max);

    }
}

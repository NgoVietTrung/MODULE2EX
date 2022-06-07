package BT1;

import javax.swing.*;
import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Numbers[" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }
        for(int i=0;i< numbers.length/2;i++){
            int temp=numbers[i];
            numbers[i]= numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]= temp;
        }
        for (int i:numbers)
            System.out.print(i+" ");
    }
}






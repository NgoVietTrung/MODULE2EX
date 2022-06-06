package BT1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Nhap so can kiem tra ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int count = 0;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if (count==2){
            System.out.println(number+" la so nguyen to");
        } else {
            System.out.println(number+" ko phai la so nguyen to");
        }
    }
}

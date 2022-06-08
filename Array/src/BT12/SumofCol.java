package BT12;

import java.util.Scanner;

public class SumofCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap size ");
        int size = scanner.nextInt();
        System.out.print("Nhap cot muon tinh tong ");
        int col = scanner.nextInt();
        int[][] numbers = new int[size][size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Array[" + i + "][" + j + "] ");
                numbers[i][j] = scanner.nextInt();
                if (j == col - 1) {
                    sum += numbers[i][col - 1];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(numbers[i][j]+" ");
                if(j==size-1){
                    System.out.println();
                }
            }
        }
        System.out.println("Tong cac so tren cot " + col + " la " + sum);
    }
}

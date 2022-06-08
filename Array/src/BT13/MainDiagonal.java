package BT13;

import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap size ");
        int size = scanner.nextInt();
        int[][] numbers = new int[size][size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Array[" + i + "][" + j + "] ");
                numbers[i][j] = scanner.nextInt();
               if(i==j){
                   sum+=numbers[i][j];
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
        System.out.println("Tong cac so tren duong cheo chinh la " + sum);
    }
}



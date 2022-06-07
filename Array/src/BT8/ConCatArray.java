package BT8;

import java.util.Scanner;

public class ConCatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai mang 1 ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];


        for (int i = 0; i < size1; i++) {
            System.out.print("array1[" + i + "] ");
            array1[i] = scanner.nextInt();
        }
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.print("Nhap chieu dai mang 2 ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        for (int j = 0; j < size1; j++) {
            System.out.print("array1[" + j + "] ");
            array2[j] = scanner.nextInt();
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i + " ");
        }
        int[] array3 = new int[size1 + size2];
        int j =0;
        for(int i:array1){
            array3[j]=i;
            j++;
        }
        for(int i:array2){
            array3[j]=i;
            j++;
        }
        System.out.println();
        for (int i : array3) {
            System.out.print(i+" ");
        }
    }
}

package Test;

import java.util.Scanner;

public class BubbleSort {
    static void arrbubblesort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap size ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Arr["+i+"] ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Mang: ");
        printarr(arr);
        System.out.println();
        System.out.print("Mang sau khi sort: ");
        arrbubblesort(arr);
    }
}
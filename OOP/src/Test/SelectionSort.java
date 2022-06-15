package Test;

import java.util.Scanner;

public class SelectionSort {
    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap size ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Arr[" + i + "] ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Mang: ");
        printarr(arr);
        System.out.println();
        System.out.print("Mang sau khi sort: ");
        selection(arr);
    }
}

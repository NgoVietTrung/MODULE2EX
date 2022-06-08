package BT11;

import java.util.Scanner;

public class PassStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So hoc sinh trong danh sach ");
        int size = scanner.nextInt();
        int[] students = new int[size];
        int count = 0;
        if (size > 30) {
            System.out.println("Vuot qua danh sach");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print("Diem hoc sinh " + (i + 1) + " ");
                students[i] = scanner.nextInt();
                if (students[i] > 5 && students[i] <= 10) {
                    count++;
                }
            }
            System.out.println("So hoc sinh dat la " + count + " ");
        }
    }
}


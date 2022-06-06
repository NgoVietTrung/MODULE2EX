package BT5;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice=-1;
        Scanner scanner = new Scanner(System.in);
        while ( choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            if (j == 7)
                                System.out.println("* ");
                            else
                                System.out.print("* ");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    for (int i = 5; i > 0; i--) {
                        for (int j = 5 - i; j > 0; j--)
                            System.out.print("  ");
                        for (int k = i; k > 0; k--)
                            System.out.print("* ");
                        System.out.println();
                    }
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5 - i; j > 0; j--)
                            System.out.print("  ");
                        for (int k = i; k > 0; k--)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5 - i; j > 0; j--)
                            System.out.print(" ");
                        for (int k = 0; k <= i; k++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}





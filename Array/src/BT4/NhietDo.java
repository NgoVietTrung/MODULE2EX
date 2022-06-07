package BT4;

import java.util.Scanner;

public class NhietDo {
    public static double CtoF(double C) {
        double F = (9.0 / 5 * C) + 32;
        return F;
    }

    public static double FtoC(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C;
        double F;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.C to F");
            System.out.println("2.F to F");
            System.out.println("0.Exit");
            System.out.print("Enter your choice ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhap C ");
                    C = scanner.nextDouble();
                    System.out.println("F: " + CtoF(C) + "F");
                    break;
                case 2:
                    System.out.println("Nhap F ");
                    F = scanner.nextDouble();
                    System.out.println("C: " + FtoC(F) + "C");
                    break;
                case 0:
                    System.exit(0);
            }
        }
            while (choice!=0);
        }
    }


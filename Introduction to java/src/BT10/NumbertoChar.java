package BT10;

import java.util.Scanner;

public class NumbertoChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ");
        int number = scanner.nextInt();
        int condition = (number > 0 && number <= 10) ? 1 : (number < 20) ? 2 : (number < 100) ? 3 : (number < 1000) ? 4 : 0;
        if (number < 0) {
            System.out.println("Out of ability");
        }
        int donvi;
        int chuc;
        int tram;
        switch (condition) {
            case 1:
                switch (number) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Ten");
                        break;
                }
            case 2:
                chuc = number - 10;
                switch (chuc) {
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }
            case 3:
                chuc = number / 10;
                donvi = number % 10;
                switch (chuc) {
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Fourty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }
                switch (donvi) {
                    case 0:
                        System.out.println();
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            case 4:
                tram = number / 100;
                chuc = number / 10 % 10;
                donvi = number % 100 % 10;
                switch (tram) {
                    case 1:
                        System.out.print("One hundred ");
                        break;
                    case 2:
                        System.out.print("Two hundred ");
                        break;
                    case 3:
                        System.out.print("Three hundred ");
                        break;
                    case 4:
                        System.out.print("Four hundred ");
                        break;
                    case 5:
                        System.out.print("Five hundred ");
                        break;
                    case 6:
                        System.out.print("Six hundred ");
                        break;
                    case 7:
                        System.out.print("Seven hundred ");
                        break;
                    case 8:
                        System.out.println("Eight hundred");
                        break;
                    case 9:
                        System.out.println("Nine hundred");
                        break;
                }
                switch (chuc) {
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Fourty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }
                switch (donvi) {
                    case 0:
                        System.out.println();
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
        }
    }
}

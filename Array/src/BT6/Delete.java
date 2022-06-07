package BT6;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phan tu can xoa : ");
        int number = scanner.nextInt();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
                for (int j = index; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numbers[numbers.length - 1] = 0;
            }
            System.out.print(numbers[i] + " ");
        }

    }
}

package BT2;

import java.util.Scanner;

public class Stundent {
    public static void main(String[] args) {
        String[] students = {"Phaps", "Thanhf", "Vux","Luong","Tien","Thien"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh ");
        String student = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                System.out.print(student+" trong danh sach o vi tri "+(i+1));
                count++;
            }
        }
        if (count==0){
            System.out.println("Khong co trong danh sach");
        }
    }
}

package BT3;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money[] = new double[20];
        for (int i = 0; i < money.length; i++) {
            System.out.print("Nhap tien ty phu so "+ (i+1)+" ");
            money[i] = scanner.nextDouble();
        }
        double max=money[0];
        int index =1;
    for (int j=0;j< money.length;j++){
        if (max<money[j]){
            max=money[j];
            index=j+1;

        }

    }
        System.out.println("Gia tri tai san lon nhat la "+ max + " o vi tri "+index);
}
}

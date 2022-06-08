package BT14;

import java.util.Scanner;

public class FindCharInStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap chuoi ");
        String str=scanner.nextLine();
        System.out.print("Ky tu can tim ");
        String kytu=scanner.nextLine();
        String str2=str.toLowerCase();
        int count=0;
        for (int i=0;i<str.length();i++){
            if(kytu.charAt(0)==str2.charAt(i)){
                count++;
            }
        }
        if (count==0){
            System.out.println("Khong co ky tu "+kytu+" trong chuoi");
        }
        System.out.print("Ky tu "+kytu+" xuat hien "+count+" lan trong "+str);
    }
}

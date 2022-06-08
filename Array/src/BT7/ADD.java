package BT7;

import java.util.Scanner;

public class ADD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int numbers[]={1,2,3,5,6};
        System.out.print("So can chen ");
        int number=scanner.nextInt();
        System.out.print("Vi tri can chen ");
        int index=scanner.nextInt();
        int numbers2[]=new int[numbers.length+1];
        int j=0;
        for(int i=0;i<index;i++){
            numbers2[i]=numbers[i];
            j++;
        }
        numbers2[j]=number;
       j++;
        for (int i=index;i<numbers.length;i++){
            numbers2[j]=numbers[i];
            j++;
        }
        for (int i:numbers2){
            System.out.println(i+" ");
        }
    }
}

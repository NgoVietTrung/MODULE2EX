package BT6;

public class PrimeNum {
    public static void main(String[] args) {
       int demnt=0;
            for (int i = 1; demnt<20; i++) {
                int demuoc =0;
                for (int j = 1; j <= i; j++)
                    if (i % j == 0) {
                        demuoc++;
                    }
                if (demuoc == 2){
                    System.out.print(i+" ");
                demnt++;}
            }




    }
}

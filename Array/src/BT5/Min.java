package BT5;

public class Min {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,-3};
        int index=min(arr);
        System.out.println("Gia tri nho nhat trong mang: "+arr[index]);

    }
    public static int min(int[] array){
        int index =0;
        for (int i =1;i< array.length;i++){
            if(array[i]<array[index]){
                index=i;
            }
        }
        return index;
    }
}



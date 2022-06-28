package BT3;

public class MyListTest {
    public static void main(String[] args) {
    MyList<Integer> myList=new MyList<Integer>(5);
        myList.add(6);
        myList.add(4);
        myList.add(1);
        myList.printlist();
        myList.add(1,2);
        myList.remove(4);
        System.out.println();
        myList.printlist();
        System.out.println();
        System.out.println(myList.size());
        System.out.println(myList.contains(3));
        System.out.println(myList.contains(4));
        System.out.println(myList.indexof(6));
    }
}

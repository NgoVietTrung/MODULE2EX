package BT1;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAUlT_CAPACITY=10;
    private Object elements[];
    public MyList(){
        elements=new Object[DEFAUlT_CAPACITY];
    }
    private void ensureCapa(){
        int newsize=elements.length*2;
        elements= Arrays.copyOf(elements, newsize);
    }
    public void add(E e){
        if(size==elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public E get(int i){
        if(i<=size||i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", Size"+i);
        }
        return (E) elements[i];
    }
}

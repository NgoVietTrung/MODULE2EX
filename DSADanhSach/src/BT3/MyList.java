package BT3;

import java.util.ArrayList;
import java.util.Arrays;


public class MyList<E> {
    private int size = 0;
    private static final int DEFAUlT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAUlT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        int newsize = elements.length * 2;
        elements = Arrays.copyOf(elements, newsize);
//            Object newElements = new Object[newsize];
//            for(int i = 0; i<size; i++){
//
//            }
//            elements=newElements;
    }
    private void checkindex(int index){
        if (index > size || index < 0)
            System.out.println("Index ko hop le");
    }

    public void add(int index, E element) {
       checkindex(index);
        if (size == index) {
            elements[size] = element;
        } else {
            if (size == elements.length) {
                ensureCapacity();
            }
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size" + i);
        }
        return (E) elements[i];
    }

    public E remove(int index) {
        checkindex(index);
        E elementdele = null;
        elementdele = (E) elements[index];
        if (index >= 0 || index < size) {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size-1]=null;
            size--;
        }
        return elementdele;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++)
            if (o.equals(elements[i]))
                return true;
        return false;
    }


    public int indexof(E o) {
        for (int i = 0; i < elements.length; i++)
            if (o.equals(elements[i]))
                return i;
        return -1;
    }
    public boolean add(E element){
        if(size==elements.length){
            return false;
        }
        elements[size++]=element;
        return true;
    }
    public void clear(){
        elements=(E[]) new Object[DEFAUlT_CAPACITY];
        size=0;
    }
    public void printlist(){
        for (E e: (E[]) elements){
            System.out.print(e+" ");
        }
    }
}




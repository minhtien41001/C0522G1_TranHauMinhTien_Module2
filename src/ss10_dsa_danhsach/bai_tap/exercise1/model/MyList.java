package ss10_dsa_danhsach.bai_tap.exercise1.model;

import java.util.Arrays;

public class MyList<E> {
    protected int capacity;
    protected int size = 0;
    public final int DEFAULT_CAPACITY = 10;
    public  Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }


    public void add(int index, Object e) {
        if(size == elements.length){
            ensureCapa();
        }
        for(int i =elements.length-1; i> index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        size++;
    }


    public void remove(int index) {
        if(index<0  || index > elements.length){
            throw new IndexOutOfBoundsException("Error");
        }
        for(int i = index;i < elements.length-1;i++){
            elements[i] = elements[i+1];
        }
        elements[elements.length-1] = null;
        size--;
    }


    public int size() {
        return  size;
    }


    public MyList<E> clone() {
        return this;
    }


    public boolean contains(Object o) {
        boolean check  = false;
        for(Object varible: elements){
            if(varible == o){
                check = true;
            }
        }
        return check;
    }


    public int indexOf(Object o) {
        int poisiton = -1;
        for(int i =0;i < size; i++){
            if(elements[i].equals(o)){
                poisiton = i;
                break;
            }
        }
        return  poisiton;
    }


    public void add(Object o) {
        if(size == elements.length){
            ensureCapa();
        }
        elements[size] = o;
        size++;
    }


    public void ensureCapa(int minCapacity) {
        elements = Arrays.copyOf(elements,minCapacity);
    }
    public void clear(){
        for(int i =0; i < size; i++){
            elements[i] = null;
        }
    }




    public Object get(int index) {
        if(index < 0 || index > elements.length){
            throw new IndexOutOfBoundsException("err");
        }
        return (E) elements[index];
    }

}

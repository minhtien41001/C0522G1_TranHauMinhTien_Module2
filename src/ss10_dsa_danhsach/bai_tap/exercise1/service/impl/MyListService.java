package ss10_dsa_danhsach.bai_tap.exercise1.service.impl;

import ss10_dsa_danhsach.bai_tap.exercise1.service.IMyListService;
import ss10_dsa_danhsach.thuc_hanh.ImplementClassList.MyList;

import java.util.Arrays;


public class MyListService<E>  implements IMyListService<E> {
    MyList<Integer> myList = new MyList<Integer>();




    @Override
    public void add(int index, E e) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public int indexOf(E o) {
        return 0;
    }

    @Override
    public void add(E o) {

    }

    @Override
    public E get(int index) {
        return null;
    }
}

package ss10_dsa_danhsach.bai_tap.exercise1.service;

import ss10_dsa_danhsach.bai_tap.exercise1.model.MyList;

public interface IMyListService<E> {


    void add(int index , E e);

    void remove(int index);





    boolean contains(E o);

    int indexOf(E o);

    void add(E o);





    E get(int index);
}

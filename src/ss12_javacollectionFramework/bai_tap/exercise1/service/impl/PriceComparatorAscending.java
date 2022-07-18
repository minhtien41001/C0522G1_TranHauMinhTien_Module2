package ss12_javacollectionFramework.bai_tap.exercise1.service.impl;

import ss12_javacollectionFramework.bai_tap.exercise1.model.Product;

import java.util.Comparator;

public class PriceComparatorAscending implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }


}

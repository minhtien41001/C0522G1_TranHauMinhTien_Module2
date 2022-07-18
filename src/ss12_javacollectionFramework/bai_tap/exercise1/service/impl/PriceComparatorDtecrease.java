package ss12_javacollectionFramework.bai_tap.exercise1.service.impl;

import ss12_javacollectionFramework.bai_tap.exercise1.model.Product;

import java.util.Comparator;

public class PriceComparatorDtecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}

package behavioral.iterator.exercise.service;

import behavioral.iterator.exercise.model.Product;

public interface ProductService {
    void addProduct(Product product);
    Iterator<Product> getIterator();
}

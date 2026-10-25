package behavioral.iterator.exercise;

import behavioral.iterator.exercise.model.Product;
import behavioral.iterator.exercise.service.ProductService;
import behavioral.iterator.exercise.service.impl.ProductServiceImpl;

public class Main {
    static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        productService.addProduct(new Product(20, "banana"));
        productService.addProduct(new Product(100, "apples"));
        productService.addProduct(new Product(50, "chocolate"));

        var productsIterator = productService.getIterator();
        while (productsIterator.hasNext()){
            System.out.println(productsIterator.getNext());
        }
    }
}

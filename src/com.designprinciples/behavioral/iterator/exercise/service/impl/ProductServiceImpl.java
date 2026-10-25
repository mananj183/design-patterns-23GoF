package behavioral.iterator.exercise.service.impl;

import behavioral.iterator.exercise.model.Product;
import behavioral.iterator.exercise.service.Iterator;
import behavioral.iterator.exercise.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Iterator<Product> getIterator() {
        return new QueueIterator(this);
    }

    private static class QueueIterator implements Iterator<Product> {
        private final ProductServiceImpl productService;
        private int index = 0;

        private QueueIterator(ProductServiceImpl productService) {
            this.productService = productService;
        }

        @Override
        public Product getNext() {
            return productService.products.get(index++);
        }

        @Override
        public boolean hasNext() {
            return index < productService.products.size();
        }
    }
}

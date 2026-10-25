package behavioral.strategy.example.one.service.impl;

import behavioral.strategy.example.one.service.Filter;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Add black and white filter");
    }
}

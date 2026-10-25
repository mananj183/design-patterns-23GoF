package behavioral.strategy.example.one.service.impl;

import behavioral.strategy.example.one.service.Filter;

public class HighContrastFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Implement high contrast filter");
    }
}

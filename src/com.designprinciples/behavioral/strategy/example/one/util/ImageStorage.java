package behavioral.strategy.example.one.util;

import behavioral.strategy.example.one.service.Compressor;
import behavioral.strategy.example.one.service.Filter;

public class ImageStorage {
    public void store(String filename, Compressor compressor, Filter filter) {
        compressor.compress(filename);
        filter.apply(filename);
        System.out.println("Storing image");
    }
}

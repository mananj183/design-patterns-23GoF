package behavioral.strategy.example.one;

import behavioral.strategy.example.one.service.impl.BlackAndWhiteFilter;
import behavioral.strategy.example.one.service.impl.HighContrastFilter;
import behavioral.strategy.example.one.service.impl.JPEGCompressor;
import behavioral.strategy.example.one.service.impl.PNGCompressor;
import behavioral.strategy.example.one.util.ImageStorage;

public class Main {
    static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JPEGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PNGCompressor(), new HighContrastFilter());
    }
}

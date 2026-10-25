package behavioral.strategy.example.one.service.impl;

import behavioral.strategy.example.one.service.Compressor;

public class JPEGCompressor implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing file using JPEG");
    }
}

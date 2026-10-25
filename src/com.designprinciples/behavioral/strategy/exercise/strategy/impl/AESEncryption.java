package behavioral.strategy.exercise.strategy.impl;

import behavioral.strategy.exercise.strategy.Encryption;

public class AESEncryption implements Encryption {
    @Override
    public void encryptText(String text) {
        System.out.printf("Encrypt text: %s using AES algo%n", text);
    }
}

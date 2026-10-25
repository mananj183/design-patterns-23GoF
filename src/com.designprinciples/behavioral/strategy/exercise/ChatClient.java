package behavioral.strategy.exercise;

import behavioral.strategy.exercise.strategy.Encryption;

public class ChatClient {
    private final Encryption encryption;

    public ChatClient(Encryption encryption) {
        this.encryption = encryption;
    }

    public void send(String text) {
        encryption.encryptText(text);
        System.out.println("Sending encrypted message");
    }
}

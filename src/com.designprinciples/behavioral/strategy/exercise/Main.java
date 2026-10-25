package behavioral.strategy.exercise;

import behavioral.strategy.exercise.strategy.impl.AESEncryption;

public class Main {
    static void main(String[] args) {
        var chatClient = new ChatClient(new AESEncryption());
        chatClient.send("ABC");
    }
}

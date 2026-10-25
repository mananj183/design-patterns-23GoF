package behavioral.template.example.two.template;

import java.nio.charset.StandardCharsets;

public class PubgGameLoader extends BaseGameLoader{
    @Override
    protected byte[] loadLocalData() {
        return "Loading pubg mobile account details".getBytes(StandardCharsets.UTF_8);
    }

    @Override
    protected void createObjects(byte[] data) {
        System.out.println("creating pubg avatars");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.println("Downloading skins");
    }

    @Override
    protected void initializeProfiles() {
        System.out.println("Initialized Google play account");
    }
}

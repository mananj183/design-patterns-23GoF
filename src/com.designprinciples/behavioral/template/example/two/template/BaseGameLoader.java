package behavioral.template.example.two.template;

public abstract class BaseGameLoader {
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    protected abstract byte[] loadLocalData();

    protected abstract void createObjects(byte[] data);

    protected abstract void downloadAdditionalFiles();

    protected abstract void initializeProfiles();

    protected void cleanTempFiles() {
        System.out.println("Cleanup temporary files");
    }
}

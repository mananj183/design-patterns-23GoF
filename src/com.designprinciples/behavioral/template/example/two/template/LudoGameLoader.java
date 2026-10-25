package behavioral.template.example.two.template;

public class LudoGameLoader extends BaseGameLoader{
    @Override
    protected byte[] loadLocalData() {
        return new byte[0];
    }

    @Override
    protected void createObjects(byte[] data) {
        System.out.println("something");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.println("something else");
    }

    @Override
    protected void initializeProfiles() {
        System.out.println("something more");
    }

    @Override
    protected void cleanTempFiles(){
        System.out.println("cleanup ludo files");
    }
}

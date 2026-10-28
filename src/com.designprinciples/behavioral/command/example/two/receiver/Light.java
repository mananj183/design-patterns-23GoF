package behavioral.command.example.two.receiver;

public class Light {

    private boolean isLightOn = false;

    public boolean isLightOn() {
        return isLightOn;
    }

    public void switchLight(){
        isLightOn = !isLightOn;
        final String mssg = isLightOn ? "Light is turned on" : "Light is turned off"; 
        System.out.println(mssg);
    }
}

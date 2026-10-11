package behavioral.state.example.two.service.impl;

import behavioral.state.example.two.service.PhoneState;

public class Phone {
    private PhoneState phoneState;

    public Phone() {
        this.phoneState = new OffPhoneState(this);
    }

    void setState(PhoneState phoneState){
        this.phoneState = phoneState;
    }

    public String onHome(){
        return this.phoneState.onHome();
    }

    public String onOnOff(){
        return this.phoneState.onOnOff();
    }

    String lock(){
        return "Locking phone and turning off the screen";
    }

    String turnOn(){
        return "Turning screen on. The device is still locked";
    }

    String unlock(){
        return "Unlocking the phone to home";
    }

    String home(){
        return "Going to home screen";
    }
}

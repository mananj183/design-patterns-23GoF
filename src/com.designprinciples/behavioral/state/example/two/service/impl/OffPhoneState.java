package behavioral.state.example.two.service.impl;

import behavioral.state.example.two.service.PhoneState;

public class OffPhoneState implements PhoneState {
    private final Phone phone;

    OffPhoneState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String onHome() {
        phone.setState(new LockedPhoneState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOnOff() {
        phone.setState(new LockedPhoneState(phone));
        return phone.turnOn();
    }
}

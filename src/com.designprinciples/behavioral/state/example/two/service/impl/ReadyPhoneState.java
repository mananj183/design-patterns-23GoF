package behavioral.state.example.two.service.impl;

import behavioral.state.example.two.service.PhoneState;

public class ReadyPhoneState implements PhoneState {
    private final Phone phone;

    ReadyPhoneState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOnOff() {
        phone.setState(new OffPhoneState(phone));
        return phone.lock();
    }
}

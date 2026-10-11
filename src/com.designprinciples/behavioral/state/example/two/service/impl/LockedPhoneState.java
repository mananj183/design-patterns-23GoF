package behavioral.state.example.two.service.impl;

import behavioral.state.example.two.service.PhoneState;

public class LockedPhoneState implements PhoneState {
    private final Phone phone;

    LockedPhoneState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String onHome() {
        phone.setState(new ReadyPhoneState(phone));
        return phone.unlock();
    }

    @Override
    public String onOnOff() {
        phone.setState(new OffPhoneState(phone));
        return phone.lock();
    }
}

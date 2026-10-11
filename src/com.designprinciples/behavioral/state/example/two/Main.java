package behavioral.state.example.two;

import behavioral.state.example.two.service.impl.Phone;

import javax.swing.JButton;


public class Main {
    static void main(String[] args) {
        final Phone phone = new Phone();
        JButton homeButton = new JButton("Home");
        homeButton.addActionListener(e -> System.out.println(phone.onHome()));
        JButton powerButton = new JButton("Power");
        powerButton.addActionListener(e -> System.out.println(phone.onOnOff()));

        powerButton.doClick();
        homeButton.doClick();
        homeButton.doClick();
        powerButton.doClick();
    }
}

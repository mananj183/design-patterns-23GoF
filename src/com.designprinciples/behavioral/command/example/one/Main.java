package behavioral.command.example.one;

import behavioral.command.example.one.command.impl.AddCustomerCommand;
import behavioral.command.example.one.fx.Button;
import behavioral.command.example.one.service.impl.CustomerServiceImpl;

public class Main {
    static void main(String[] args) {
        var addCustomerCommand = new AddCustomerCommand(new CustomerServiceImpl());
        var button = new Button(addCustomerCommand);
        button.click();
    }
}

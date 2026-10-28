package behavioral.command.example.one.command.impl;

import behavioral.command.example.one.command.Command;
import behavioral.command.example.one.service.CustomerService;

public class AddCustomerCommand implements Command {
    private final CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}

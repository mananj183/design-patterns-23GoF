package behavioral.command.example.one.service.impl;

import behavioral.command.example.one.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void addCustomer() {
        System.out.println("Functionality to add new customers");
    }
}

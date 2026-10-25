package behavioral.template.example.one;

import behavioral.template.example.one.template.AuditTrail;
import behavioral.template.example.one.template.TransactionManager;

public class Main {
    static void main(String[] args) {
        var transactionManager = new TransactionManager(new AuditTrail());
        transactionManager.execute();
    }
}

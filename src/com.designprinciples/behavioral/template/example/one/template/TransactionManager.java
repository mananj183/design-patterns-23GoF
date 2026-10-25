package behavioral.template.example.one.template;

public class TransactionManager extends Action {
    public TransactionManager(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Withdraw action");
    }
}

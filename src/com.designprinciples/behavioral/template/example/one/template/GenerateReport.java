package behavioral.template.example.one.template;

public class GenerateReport extends Action{
    public GenerateReport(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generating Report");
    }
}

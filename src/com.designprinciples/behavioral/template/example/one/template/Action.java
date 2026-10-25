package behavioral.template.example.one.template;

public abstract class Action {
    private final AuditTrail auditTrail;

    // Either we can pass the audit trail object from constructor if we want to have different implementations for Audit trail
    protected Action(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
        // Else we can simply create a new AuditTrail object here
        // this.auditTrail = new AuditTrail();
    }



    public final void execute() {
        auditTrail.addAuditEvent();
        doExecute();
    }

    protected abstract void doExecute();
}

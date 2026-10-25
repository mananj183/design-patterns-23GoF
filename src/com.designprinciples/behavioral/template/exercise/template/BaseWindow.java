package behavioral.template.exercise.template;

public abstract class BaseWindow {

    public void close(){
        doBefore();
        System.out.println("Close window");
        doAfter();
    }

    protected abstract void doAfter();

    protected abstract void doBefore();
}

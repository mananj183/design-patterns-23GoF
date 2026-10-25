package behavioral.template.exercise.template;

public class ReactWindow extends BaseWindow{
    @Override
    protected void doAfter() {
        System.out.println("After close window- React");
    }

    @Override
    protected void doBefore() {
        System.out.println("Before close window - React");
    }
}

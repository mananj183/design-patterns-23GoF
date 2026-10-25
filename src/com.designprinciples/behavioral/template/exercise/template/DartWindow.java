package behavioral.template.exercise.template;

public class DartWindow extends BaseWindow{
    @Override
    protected void doAfter() {
        System.out.println("After close window - Dart");
    }

    @Override
    protected void doBefore() {
        System.out.println("Before close window - Dart");
    }
}

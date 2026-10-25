package behavioral.iterator.example.one;

public class Main {
    static void main(String[] args) {
        var history = new BrowserHistory();
        history.addUrl("1");
        history.addUrl("2");
        history.addUrl("3");
        var iterator = history.getIterator();
        while (iterator.hasNext()){
            System.out.println(history.pop());
        }
    }
}

package behavioral.iterator.example.one;

import java.util.Iterator;

public class BrowserHistory {
//    private final List<String> urls = new ArrayList<>();
    private final String[] urls = new String[100];
    private Integer count = 0;

    public void addUrl(String url){
        urls[count++] = url;
    }
    public String pop(){
        var lastIndex = --count;
        var lastUrl = urls[lastIndex];
        urls[lastIndex] = null;
        return lastUrl;
    }
    public Iterator<String> getIterator(){
        return new ArrayIterator(this);
    }

//    public static class ListIterator implements Iterator<String> {
//
//        private final BrowserHistory browserHistory;
//        private Integer index = 0;
//
//        public ListIterator(BrowserHistory browserHistory) {
//            this.browserHistory = browserHistory;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return index < browserHistory.urls.size();
//        }
//
//        @Override
//        public String next() {
//            return browserHistory.urls.get(index++);
//        }
//    }

    public static class ArrayIterator implements Iterator<String> {

        private final BrowserHistory history;
        private Integer index = 0;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.count;
        }

        @Override
        public String next() {
            return history.urls[index++];
        }
    }
}

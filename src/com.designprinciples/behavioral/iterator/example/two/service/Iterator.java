package behavioral.iterator.example.two.service;

import behavioral.iterator.example.two.model.Vertex;

public interface Iterator<T> {

    boolean hasNext();

    Vertex<T> getNext();

    void reset();

}

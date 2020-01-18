package edu.escuelaing.arem.ASE.app.model;

import java.util.Iterator;

class ListIteratorPersonal<E> implements Iterator<E> {
    Node<E> current;

    public ListIteratorPersonal(Node<E> actual) {
        current = actual;
    }

    public boolean hasNext() {
        return current != null;
    }

    public E next() {
        E data = current.getData();
        current = current.getNext();
        return data;
    }

}

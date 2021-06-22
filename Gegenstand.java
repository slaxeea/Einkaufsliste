package datenstrukturen;

/**
 * author simon kappeler Created At: 26.05.2021
 */
public class Gegenstand<T> {

    private T element;
    private Gegenstand next = null;

    Gegenstand() {
    }

    Gegenstand(T e, Gegenstand n) {
        element = e;
        next = n;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Gegenstand getNext() {
        return next;
    }

    public void setNext(Gegenstand g) {
        next = g;
    }

    @Override
    public String toString() {
        return element + "  ";
    }

}

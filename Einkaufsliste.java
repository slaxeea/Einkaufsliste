package datenstrukturen;

/**
 * author simon kappeler Created At: 26.05.2021
 */
public class Einkaufsliste<T> implements List<T> {

    private Gegenstand anker;

    public void Einkaufliste() {

    }

    public void addFirst(T element) {
        Gegenstand neww = new Gegenstand(element, anker);
        anker = neww;
    }

    public void addLast(T element) {
        if (isEmpty()) {
            anker = new Gegenstand(element, null);
        } else {
            Gegenstand g = getLastNode();
            Gegenstand next = new Gegenstand(element, null);
            g.setNext(next);
        }
    }

    public void removeFirst() {
        anker = anker.getNext();
    }

    public void removeLast() {
        Gegenstand g = anker;
        int len = size();

        switch (len) {
            case 0:
                break;
            case 1:
                anker = null;
                break;
            default:
                while (g.getNext().getNext() != null) {
                    g = g.getNext();
                }
                g.setNext(null);
                break;
        }
    }

    public int size() {
        boolean cont = true;
        int count = 1;
        Gegenstand a = anker;
        if (a != null) {
            while (cont) {
                a = a.getNext();
                if (a != null) {
                    count++;
                } else {
                    cont = false;
                    return count;
                }
            }
        } else {
            return 0;
        }
        return 0;
    }

    public String getFirst() {
        return anker.toString();
    }

    public String getLast() {
        return getLastNode().toString();
    }

    public boolean isEmpty() {
        return anker == null;
    }

    private Gegenstand getLastNode() {
        Gegenstand g = anker;
        while (g.getNext() != null) {
            g = g.getNext();
        }
        return g;
    }

    public Gegenstand getAnker() {
        return anker;
    }

}

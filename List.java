package datenstrukturen;

/**
 * author simon kappeler Created At: 26.05.2021
 */
public interface List<T> {

    public void addFirst(T element);

    public void addLast(T element);

    public void removeFirst();

    public void removeLast();

    public int size();
}

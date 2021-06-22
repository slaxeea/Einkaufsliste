package datenstrukturen;

/**
 * author simon kappeler Created At: 26.05.2021
 */
public class Datenstrukturen {

    public static void main(String[] args) {
        Einkaufsliste<String> liste = new Einkaufsliste<>();

        liste.addFirst("1");
        liste.addFirst("2");
        liste.addFirst("3");
        print(liste);

        liste.removeLast();

        print(liste);

        liste.removeFirst();

        print(liste);

    }

    public static void print(Einkaufsliste l) {
        Gegenstand g = l.getAnker();
        while (g != null) {
            System.out.println(g.toString());
            g = g.getNext();
        }
        System.out.println("\n");
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Tablica {

    public int moda(int[] table) throws NoSuchElementException {

        ArrayList<Element> lista = new ArrayList<Element>();
        if (table.length == 0) {
            throw new NoSuchElementException();
        } else {

            for (int i = 0; i < table.length; i++) {
                int liczba = table[i];
                int suma = 0;
                for (int j = 0; j < table.length; j++) {
                    if (liczba == table[j]) {
                        suma++;
                    }
                }
                lista.add(new Element(liczba, suma));
            }
            MojComparator comp = new MojComparator();
            Collections.sort(lista, comp);
            return lista.get(0).getLiczba();
        }
    }
    class Element {
        int liczba;
        int suma;

        public Element(int liczba, int suma) {
            this.liczba = liczba;
            this.suma = suma;
        }

        public int getLiczba() {
            return liczba;
        }

        public int getSuma() {
            return suma;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "liczba=" + liczba +
                    ", suma=" + suma +
                    '}' + "\n";
        }
    }

    class MojComparator implements Comparator<Element> {

        @Override
        public int compare(Element o1, Element o2) {
            if (o1.getSuma() == o2.getSuma()) {
                if (o1.getLiczba() > o2.getLiczba()) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (o1.getSuma() > o2.getSuma()) {
                return -1;
            } else {
                return 1;
            }

        }
    }


}
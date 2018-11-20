public class TablicaTest {
    public static void main(String[] args) throws NoSuchElementException {
        Tablica tab = new Tablica();
        int[] tab1 = {5, 5, 5, 8, 3, 3, 3, 10, 2, 1, 2};

        System.out.println("Najczęściej wystepuje:  \n " + tab.moda(tab1));

    }

}
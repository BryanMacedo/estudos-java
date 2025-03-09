package javaProgramacaoOrientadaObjetos.Ycolecoes.test;

import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Manga;
import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");

        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(); // ordena automaticamente com base no compareTo
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.20, 2));
        mangas.add(new Manga(10L, "Aaragon", 11.20, 2));
        mangas.add(new Manga(10L, "Aaragon", 18.20, 2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}





















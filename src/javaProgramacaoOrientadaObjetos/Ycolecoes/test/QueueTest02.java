package javaProgramacaoOrientadaObjetos.Ycolecoes.test;

import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Consumidor;
import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.20, 2));
        mangas.add(new Manga(10L, "Aaragon", 11.20, 2));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}














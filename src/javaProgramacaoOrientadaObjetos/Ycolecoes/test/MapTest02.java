package javaProgramacaoOrientadaObjetos.Ycolecoes.test;

import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Consumidor;
import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor("Bryan Macedo");
        Consumidor consumidor02 = new Consumidor("Soma");

        Manga manga01 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga02 = new Manga(1L, "Berserk", 9.5);
        Manga manga03 = new Manga(4L, "Pokemon", 3.2);
        Manga manga04 = new Manga(3L, "Attack on titan", 11.20);
        Manga manga05 = new Manga(2L, "Dragon ball Z", 2.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor01, manga01);
        consumidorManga.put(consumidor02, manga04);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }


    }
}













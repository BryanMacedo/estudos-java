package javaProgramacaoOrientadaObjetos.Ycolecoes.test;

import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Consumidor;
import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor("Bryan Macedo");
        Consumidor consumidor02 = new Consumidor("Soma");

        Manga manga01 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga02 = new Manga(1L, "Berserk", 9.5);
        Manga manga03 = new Manga(4L, "Pokemon", 3.2);
        Manga manga04 = new Manga(3L, "Attack on titan", 11.20);
        Manga manga05 = new Manga(2L, "Dragon ball Z", 2.99);

        List<Manga> mangaConsumidorList = List.of(manga01, manga02, manga03);
        List<Manga> mangaConsumidorList02 = List.of(manga03, manga04);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor01, mangaConsumidorList);
        consumidorMangaMap.put(consumidor02, mangaConsumidorList02);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("-----" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("---------" + manga.getNome());
            }

        }


    }
}













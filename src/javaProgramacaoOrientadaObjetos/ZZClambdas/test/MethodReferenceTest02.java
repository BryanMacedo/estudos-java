package javaProgramacaoOrientadaObjetos.ZZClambdas.test;

import javaProgramacaoOrientadaObjetos.ZZClambdas.dominio.Anime;
import javaProgramacaoOrientadaObjetos.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 1152),
                new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1,a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}



















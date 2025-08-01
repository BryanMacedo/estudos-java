package javaProgramacaoOrientadaObjetos.ZZClambdas.test;

import javaProgramacaoOrientadaObjetos.ZZClambdas.dominio.Anime;
import javaProgramacaoOrientadaObjetos.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 1152),
                new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction02 = Anime::new;
        System.out.println(animeBiFunction02.apply("One piece", 1152));
    }
}






















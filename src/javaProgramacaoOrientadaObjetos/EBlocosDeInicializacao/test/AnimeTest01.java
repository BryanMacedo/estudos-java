package javaProgramacaoOrientadaObjetos.EBlocosDeInicializacao.test;

import javaProgramacaoOrientadaObjetos.EBlocosDeInicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();

        for (int episodio : anime01.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}

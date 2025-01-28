package javaProgramacaoOrientadaObjetos.CSobrecargaMetodos.test;

import javaProgramacaoOrientadaObjetos.CSobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        anime01.init("Akumada drive", "TV", 12, "Ação");
        anime01.imprime();
    }
}

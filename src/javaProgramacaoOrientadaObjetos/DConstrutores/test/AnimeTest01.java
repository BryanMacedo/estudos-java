package javaProgramacaoOrientadaObjetos.DConstrutores.test;


import javaProgramacaoOrientadaObjetos.DConstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("One piece","TV", 12, "Ação", "Production IG");
        anime01.imprime();
    }
}

package javaProgramacaoOrientadaObjetos.GAssociacao.test;

import javaProgramacaoOrientadaObjetos.GAssociacao.dominio.Jogador;
import javaProgramacaoOrientadaObjetos.GAssociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("pelé");
        Time time = new Time("Seleção Brasileira");

        jogador01.setTime(time);
        jogador01.imprime();
    }
}

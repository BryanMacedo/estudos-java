package javaProgramacaoOrientadaObjetos.GAssociacao.test;

import javaProgramacaoOrientadaObjetos.GAssociacao.dominio.Jogador;
import javaProgramacaoOrientadaObjetos.GAssociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador01, jogador02};

        jogador01.setTime(time);
        jogador02.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador01.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}

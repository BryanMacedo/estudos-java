package javaProgramacaoOrientadaObjetos.GAssociacao.test;

import javaProgramacaoOrientadaObjetos.GAssociacao.dominio.Jogador;

import java.util.StringTokenizer;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}

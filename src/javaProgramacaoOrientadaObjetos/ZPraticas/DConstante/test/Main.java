package javaProgramacaoOrientadaObjetos.ZPraticas.DConstante.test;

import javaProgramacaoOrientadaObjetos.ZPraticas.DConstante.dominio.*;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("rick", 7, "Preto");
        Gato gato = new Gato("Tom", 9, "Laranja e branco");
        Passaro passaro = new Passaro("dourado", 2, "Amarelo");
        Pastor_alemao pastor_alemao = new Pastor_alemao("princesa", 11, "Preto e branco", "Uruguai");
        Persa persa = new Persa("Sombrinha", 8, "cinza", "Brasil");
        Calopsita calopsita = new Calopsita("Fiel", 10, "Amarelo e branco", "Canada");

        System.out.println("------------------------");
        cachorro.correr();
        cachorro.emitirSom();
        cachorro.informacoes();
        System.out.println("------------------------");

        gato.escalar();
        gato.emitirSom();
        gato.informacoes();
        System.out.println("------------------------");

        passaro.voar();
        passaro.emitirSom();
        passaro.informacoes();
        System.out.println("------------------------");

        pastor_alemao.correr();
        pastor_alemao.emitirSom();
        pastor_alemao.informacoes();
        System.out.println("------------------------");

        persa.escalar();
        persa.emitirSom();
        persa.informacoes();
        System.out.println("------------------------");

        calopsita.voar();
        calopsita.emitirSom();
        calopsita.informacoes();
        System.out.println("------------------------");

    }
}

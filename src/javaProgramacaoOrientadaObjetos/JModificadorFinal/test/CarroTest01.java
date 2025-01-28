package javaProgramacaoOrientadaObjetos.JModificadorFinal.test;

import javaProgramacaoOrientadaObjetos.JModificadorFinal.dominio.Carro;
import javaProgramacaoOrientadaObjetos.JModificadorFinal.dominio.Comprador;
import javaProgramacaoOrientadaObjetos.JModificadorFinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("johnny");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}





















package javaProgramacaoOrientadaObjetos.NPolimorfismo.test;

import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Computador;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Televisao;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Tomate;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}


















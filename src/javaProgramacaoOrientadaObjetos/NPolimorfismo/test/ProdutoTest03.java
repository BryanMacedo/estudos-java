package javaProgramacaoOrientadaObjetos.NPolimorfismo.test;

import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Computador;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Produto;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Tomate;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/03/2025");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(produto01);

    }
}
















package javaProgramacaoOrientadaObjetos.NPolimorfismo.test;

import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Computador;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Produto;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("--------------------");

        Produto produto02 = new Tomate("Americano", 20);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularImposto());
    }
}
















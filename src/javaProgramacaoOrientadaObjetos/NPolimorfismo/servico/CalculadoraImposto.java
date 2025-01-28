package javaProgramacaoOrientadaObjetos.NPolimorfismo.servico;

import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Produto;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println("--- Relatório de imposto ---");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();

            System.out.println("Data de validade: " + dataValidade);
        }
    }
}
















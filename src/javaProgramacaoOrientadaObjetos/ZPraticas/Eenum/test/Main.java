package javaProgramacaoOrientadaObjetos.ZPraticas.Eenum.test;

import javaProgramacaoOrientadaObjetos.ZPraticas.Eenum.dominio.Calculadora;
import javaProgramacaoOrientadaObjetos.ZPraticas.Eenum.dominio.TipoOperacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor da operação: ");
        double valor01 = sc.nextDouble();

        System.out.print("Informe o tipo de operação que deseja realizar: ");
        String operacao = sc.next();

        System.out.print("Informe o segundo valor da operação: ");
        double valor02 = sc.nextDouble();

        switch (operacao) {
            case "adição" -> {
                Calculadora calc = new Calculadora(valor01, valor02, TipoOperacao.ADICAO);
                calc.adicao();
                break;
            }
            case "subtração" -> {
                Calculadora calc = new Calculadora(valor01, valor02, TipoOperacao.SUBTRACAO);
                calc.subtracao();
                break;
            }
            case "multiplicação" -> {
                Calculadora calc = new Calculadora(valor01, valor02, TipoOperacao.MULTIPLICACAO);
                calc.multiplicacao();
                break;
            }
            case "divisão" -> {
                Calculadora calc = new Calculadora(valor01, valor02, TipoOperacao.DIVISAO);
                calc.divisao();
                break;
            }
        }




        sc.close();
    }
}

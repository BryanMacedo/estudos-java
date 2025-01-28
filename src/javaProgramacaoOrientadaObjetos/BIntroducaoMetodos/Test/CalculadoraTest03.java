package javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Test;

import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double result = calc.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calc.divideDoisNumeros02(20,0));
        System.out.println("------------------");
        calc.imprimeDivisaoDoisNumeros(86,0);

    }
}
















package javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Test;

import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        // variáveis do tipo primitivo (int, char etc) sempre uma copía é enviada, então o seu valor real não é alterado
        Calculadora calc = new Calculadora();
        int a = 1;
        int b = 2;
        calc.alteraDoisNumeros(a,b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);
    }
}




























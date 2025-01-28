package javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Test;

import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Finalizando calculadoraTest01");
        calc.subtraiDoisNumeros();
    }
}

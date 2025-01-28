package javaProgramacaoOrientadaObjetos.LClassesAbstratas.test;

import javaProgramacaoOrientadaObjetos.LClassesAbstratas.dominio.Desenvolvedor;
import javaProgramacaoOrientadaObjetos.LClassesAbstratas.dominio.Funcionario;
import javaProgramacaoOrientadaObjetos.LClassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente01 = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Franky", 12000);
        System.out.println(gerente01);
        System.out.println(desenvolvedor01);
        gerente01.imprime();
        desenvolvedor01.imprime();
    }
}


















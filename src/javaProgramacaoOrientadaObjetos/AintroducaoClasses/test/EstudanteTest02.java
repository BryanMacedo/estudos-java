package javaProgramacaoOrientadaObjetos.AintroducaoClasses.test;

import javaProgramacaoOrientadaObjetos.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Sanji";

        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);

        System.out.println("------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);
    }
}

package javaProgramacaoOrientadaObjetos.AintroducaoClasses.test;

import javaProgramacaoOrientadaObjetos.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();

        estudante01.nome = "Bryan";
        estudante01.idade = 23;
        estudante01.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01);
    }
}

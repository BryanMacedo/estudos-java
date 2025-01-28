package javaProgramacaoOrientadaObjetos.AintroducaoClasses.test;

import javaProgramacaoOrientadaObjetos.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor();

        professor01.nome = "Simone";
        professor01.idade = 42;
        professor01.sexo = 'F';

        System.out.println("Professor: " + professor01.nome + " - " +
                professor01.idade + " - " + professor01.sexo);
    }
}





















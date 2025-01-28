package javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Test;

import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.Estudante;
import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Rogue";
        estudante01.idade = 90;
        estudante01.sexo = 'F';

        estudante02.nome = "johnny SilverHand";
        estudante02.idade = 30;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("#####################");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);



    }
}






















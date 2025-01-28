package javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Test;

import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.Estudante;


public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Rogue";
        estudante01.idade = 90;
        estudante01.sexo = 'F';

        estudante02.nome = "johnny SilverHand";
        estudante02.idade = 30;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}

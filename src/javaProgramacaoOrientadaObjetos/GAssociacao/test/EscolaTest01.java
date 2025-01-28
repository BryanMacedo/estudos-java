package javaProgramacaoOrientadaObjetos.GAssociacao.test;

import javaProgramacaoOrientadaObjetos.GAssociacao.dominio.Escola;
import javaProgramacaoOrientadaObjetos.GAssociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Simone");
        Professor professor02 = new Professor("Liliane");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("Paulo Freire", professores);

        escola.imprime();
    }
}

package javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Test;

import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Takemura");
        pessoa01.setIdade(72);
        //pessoa01.imprime();
        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());

    }
}

package javaProgramacaoOrientadaObjetos.NPolimorfismo.servico;

import javaProgramacaoOrientadaObjetos.NPolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de dados");
    }
}

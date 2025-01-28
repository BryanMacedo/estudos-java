package javaProgramacaoOrientadaObjetos.NPolimorfismo.servico;

import javaProgramacaoOrientadaObjetos.NPolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}

package javaProgramacaoOrientadaObjetos.NPolimorfismo.servico;

import javaProgramacaoOrientadaObjetos.NPolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");
    }
}

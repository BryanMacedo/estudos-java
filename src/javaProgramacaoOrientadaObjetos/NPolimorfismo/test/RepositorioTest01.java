package javaProgramacaoOrientadaObjetos.NPolimorfismo.test;

import javaProgramacaoOrientadaObjetos.NPolimorfismo.repositorio.Repositorio;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.servico.RepositorioArquivo;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.servico.RepositorioBancoDeDados;
import javaProgramacaoOrientadaObjetos.NPolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}















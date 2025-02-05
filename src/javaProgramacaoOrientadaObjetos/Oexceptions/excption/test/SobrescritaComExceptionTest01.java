package javaProgramacaoOrientadaObjetos.Oexceptions.excption.test;

import javaProgramacaoOrientadaObjetos.Oexceptions.excption.dominio.Funcionario;
import javaProgramacaoOrientadaObjetos.Oexceptions.excption.dominio.LoginInvalidoException;
import javaProgramacaoOrientadaObjetos.Oexceptions.excption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

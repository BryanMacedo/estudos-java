package javaProgramacaoOrientadaObjetos.Oexceptions.excption.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException { // sobrescrita ñ precisa delcarar as msm exceções q o metodo esta declarando
        System.out.println("Salvando Funcionario"); //ñ pode declarar exceções mais genericas das que já foram declaradas no metodo original
    }
}

package javaProgramacaoOrientadaObjetos.Hheranca.test;

import javaProgramacaoOrientadaObjetos.Hheranca.dominio.Endereco;
import javaProgramacaoOrientadaObjetos.Hheranca.dominio.Funcionario;
import javaProgramacaoOrientadaObjetos.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua JigJig");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Wakako");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----------------------");

        Funcionario funcionario = new Funcionario("Doutor Dedinho");
        funcionario.setCpf("222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(900);
        funcionario.imprime();
    }
}


















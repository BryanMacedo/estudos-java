package Praticas.Asobrecarga.test;

import Praticas.Asobrecarga.dominio.Funcionario;
import Praticas.Asobrecarga.dominio.MaiorSalario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Takemura", 50, 10000, "Arasaka");
        Funcionario funcionario02 = new Funcionario("Anders Hellman", 29, 8000, "Kang TAO");
        MaiorSalario maiorSalario = new MaiorSalario();


        funcionario01.imprime();
        funcionario02.imprime();
        maiorSalario.MaiorSalarioFuncionarios(funcionario01, funcionario02);
    }
}

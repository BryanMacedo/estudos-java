package javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Test;

import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.Funcionario;
import javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio.MediaSalarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        MediaSalarios mediaSalarios = new MediaSalarios();
        double[] salarios = {1200, 1000, 900, 5000};

        funcionario01.setNome("Bryan");
        funcionario01.setIdade(23);
        funcionario01.setSalarios(salarios);
        funcionario01.imprime();

        mediaSalarios.mediaSalarios(funcionario01);

    }
}

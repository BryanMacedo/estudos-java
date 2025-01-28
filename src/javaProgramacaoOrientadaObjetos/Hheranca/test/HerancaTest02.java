package javaProgramacaoOrientadaObjetos.Hheranca.test;

import javaProgramacaoOrientadaObjetos.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    //1 - Bloco de inicialização estático da sub classe é executado quando JVM carregar a classe filha
    //2 - Alocado espaço em memória para o objeto da classe pai
    //3 - cada atributo de classe da classe pai é criado e inicializado com valores default ou oq for passado da classe pai
    //4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    //5 - Construtor da super classe é executado
    //6 - Alocado espaço em memória para o objeto da sub classe
    //7 - cada atributo de classe da sub clase é criado e inicializado com valores default ou oq for passado da classe filha
    //4 - Bloco de inicialização da sub classe é executado na ordem em que aparece
    //5 - Construtor da sub classe é executado
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Bryan");
    }
}




















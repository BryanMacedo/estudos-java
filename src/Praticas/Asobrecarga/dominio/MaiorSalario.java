package Praticas.Asobrecarga.dominio;

public class MaiorSalario {
    public void MaiorSalarioFuncionarios(Funcionario funcionario01, Funcionario funcionario02){
        if (funcionario01.getSalary() > funcionario02.getSalary()){
            System.out.println(funcionario01.getName() + " tem um salario maior que o funcionario " + funcionario02.getName());
        }else {
            System.out.println(funcionario02.getName() + " tem um salario maior que o funcionario " + funcionario01.getName());
        }
    }
}

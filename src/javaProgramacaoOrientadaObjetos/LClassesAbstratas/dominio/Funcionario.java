package javaProgramacaoOrientadaObjetos.LClassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa{
    // em classes abstratas é possivel ter métodos abstratos e nao abstratos(concretos)
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}






















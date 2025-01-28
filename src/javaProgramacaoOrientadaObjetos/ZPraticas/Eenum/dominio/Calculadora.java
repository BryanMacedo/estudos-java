package javaProgramacaoOrientadaObjetos.ZPraticas.Eenum.dominio;

public class Calculadora {
    private double valor01;
    private double valor02;
    private TipoOperacao tipoOperacao;

    public Calculadora(double valor01, double valor02, TipoOperacao tipoOperacao) {
        this.valor01 = valor01;
        this.valor02 = valor02;
        this.tipoOperacao = tipoOperacao;
    }

    public void adicao() {
        double adicao = this.valor01 + this.valor02;
        System.out.println("O resultado de " + this.valor01 + " " + tipoOperacao.getSimbolo() + " " + this.valor02 + " é: " + adicao);
    }

    public void subtracao() {
        double subtracao = this.valor01 - this.valor02;
        System.out.println("O resultado de " + this.valor01 + " " + tipoOperacao.getSimbolo() + " " + this.valor02 + " é: " + subtracao);
    }

    public void multiplicacao() {
        double multiplicacao = this.valor01 * this.valor02;
        System.out.println("O resultado de " + this.valor01 + " " + tipoOperacao.getSimbolo() + " " + this.valor02 + " é: " + multiplicacao);
    }

    public void divisao() {
        double divisao = this.valor01 / this.valor02;
        System.out.println("O resultado de " + this.valor01 + " " + tipoOperacao.getSimbolo() + " " + this.valor02 + " é: " + divisao);
    }

}

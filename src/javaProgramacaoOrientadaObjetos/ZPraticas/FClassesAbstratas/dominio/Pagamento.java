package javaProgramacaoOrientadaObjetos.ZPraticas.FClassesAbstratas.dominio;

public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processarPagamento();

    public abstract void gerarRecibo();

    public double getValor() {
        return valor;
    }

}

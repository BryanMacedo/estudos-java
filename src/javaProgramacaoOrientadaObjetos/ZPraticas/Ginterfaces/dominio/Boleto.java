package javaProgramacaoOrientadaObjetos.ZPraticas.Ginterfaces.dominio;

public class Boleto implements MetodoPagamento, MetodoCancelamento{
    private double valor;

    @Override
    public void pagar(double valor) {
        System.out.println("Iniciando o pagamento no boleto no valor de R$ " + valor);
        this.valor = valor;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando o pagamento no boleto...");
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Pagamento recebido do boleto no valor de R$ " + this.valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando o pagamento do boleto no valor de R$ " + this.valor);
    }
}

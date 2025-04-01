package Praticas.Ginterfaces.dominio;

public class CartaoCredito implements MetodoPagamento, MetodoCancelamento{
    private double valor;

    @Override
    public void pagar(double valor) {
        System.out.println("Iniciando o pagamento no cartão de credito no valor de R$ " + valor);
        this.valor = valor;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando o pagamento no cartão de credito...");
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Pagamento recebido do cartão de credito no valor de R$ " + this.valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando o pagamento do cartão de credito no valor de R$ " + this.valor);
    }
}

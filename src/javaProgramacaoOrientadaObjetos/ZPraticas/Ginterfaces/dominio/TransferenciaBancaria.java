package javaProgramacaoOrientadaObjetos.ZPraticas.Ginterfaces.dominio;

public class TransferenciaBancaria implements MetodoPagamento, MetodoCancelamento {
    private double valor;

    @Override
    public void pagar(double valor) {
        System.out.println("Iniciando o pagamento na transferência bancaria no valor de R$ " + valor);
        this.valor = valor;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando o pagamento na transferência bancaria...");
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Pagamento recebido da transferência bancaria no valor de R$ " + this.valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando o pagamento da transferência bancaria no valor de R$ " + this.valor);
    }
}

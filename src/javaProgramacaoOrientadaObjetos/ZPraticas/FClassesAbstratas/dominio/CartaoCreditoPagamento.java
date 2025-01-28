package javaProgramacaoOrientadaObjetos.ZPraticas.FClassesAbstratas.dominio;

public class CartaoCreditoPagamento extends Pagamento{
    public CartaoCreditoPagamento(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento por cartão de crédito no valor de R$ " + getValor());
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo: Pagamento por cartão de crédito no valor de R$ " + getValor());
    }
}

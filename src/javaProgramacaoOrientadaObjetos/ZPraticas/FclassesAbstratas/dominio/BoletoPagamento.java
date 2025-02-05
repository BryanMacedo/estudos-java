package javaProgramacaoOrientadaObjetos.ZPraticas.FclassesAbstratas.dominio;

public class BoletoPagamento extends Pagamento{
    public BoletoPagamento(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento por boleto no valor de R$ " + getValor());
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo: Pagamento por boleto no valor de R$ " + getValor());
    }
}

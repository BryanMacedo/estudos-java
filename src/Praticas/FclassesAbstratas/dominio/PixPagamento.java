package Praticas.FclassesAbstratas.dominio;

public class PixPagamento extends Pagamento{

    public PixPagamento(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento por PIX no valor de R$ " + getValor());
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo: Pagamento por PIX no valor de R$ " + getValor());
    }
}

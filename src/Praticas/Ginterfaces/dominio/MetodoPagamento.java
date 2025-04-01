package Praticas.Ginterfaces.dominio;

public interface MetodoPagamento {

    void pagar(double valor);
    void processarPagamento();
    void gerarRecibo();
}

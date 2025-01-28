package javaProgramacaoOrientadaObjetos.ZPraticas.FClassesAbstratas.test;


import javaProgramacaoOrientadaObjetos.ZPraticas.FClassesAbstratas.dominio.BoletoPagamento;
import javaProgramacaoOrientadaObjetos.ZPraticas.FClassesAbstratas.dominio.CartaoCreditoPagamento;
import javaProgramacaoOrientadaObjetos.ZPraticas.FClassesAbstratas.dominio.PixPagamento;

public class Main {
    public static void main(String[] args) {
        BoletoPagamento boletoPagamento = new BoletoPagamento(1200);
        CartaoCreditoPagamento cartaoCreditoPagamento = new CartaoCreditoPagamento(800);
        PixPagamento pixPagamento = new PixPagamento(4999);

        boletoPagamento.processarPagamento();
        boletoPagamento.gerarRecibo();

        System.out.println("===============================================================");

        cartaoCreditoPagamento.processarPagamento();
        cartaoCreditoPagamento.gerarRecibo();

        System.out.println("===============================================================");

        pixPagamento.processarPagamento();
        pixPagamento.gerarRecibo();
    }
}

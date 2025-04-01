package Praticas.FclassesAbstratas.test;


import Praticas.FclassesAbstratas.dominio.BoletoPagamento;
import Praticas.FclassesAbstratas.dominio.CartaoCreditoPagamento;
import Praticas.FclassesAbstratas.dominio.PixPagamento;

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

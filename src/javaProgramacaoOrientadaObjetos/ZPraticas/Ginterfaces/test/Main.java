package javaProgramacaoOrientadaObjetos.ZPraticas.Ginterfaces.test;

import javaProgramacaoOrientadaObjetos.ZPraticas.Ginterfaces.dominio.Boleto;
import javaProgramacaoOrientadaObjetos.ZPraticas.Ginterfaces.dominio.CartaoCredito;
import javaProgramacaoOrientadaObjetos.ZPraticas.Ginterfaces.dominio.TransferenciaBancaria;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        Boleto boleto = new Boleto();
        TransferenciaBancaria tranferencia = new TransferenciaBancaria();

        cartaoCredito.pagar(23);
        cartaoCredito.processarPagamento();
        cartaoCredito.gerarRecibo();
        cartaoCredito.cancelarPagamento();

        System.out.println("\n--------------------------------------------------------------------\n");

        boleto.pagar(72);
        boleto.processarPagamento();
        boleto.gerarRecibo();
        boleto.cancelarPagamento();

        System.out.println("\n--------------------------------------------------------------------\n");

        tranferencia.pagar(15);
        tranferencia.processarPagamento();
        tranferencia.gerarRecibo();
        tranferencia.cancelarPagamento();
    }
}

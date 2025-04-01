package Praticas.Ginterfaces.test;

import Praticas.Ginterfaces.dominio.Boleto;
import Praticas.Ginterfaces.dominio.CartaoCredito;
import Praticas.Ginterfaces.dominio.TransferenciaBancaria;

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

package javaProgramacaoOrientadaObjetos.KEnum.test;

import javaProgramacaoOrientadaObjetos.KEnum.dominio.Cliente;
import javaProgramacaoOrientadaObjetos.KEnum.dominio.TipoCliente;
import javaProgramacaoOrientadaObjetos.KEnum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Goku", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Vegeta", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente02 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente02);
    }
}





















package javaProgramacaoOrientadaObjetos.Zgenerics.test;

import javaProgramacaoOrientadaObjetos.Zgenerics.dominio.Barco;
import javaProgramacaoOrientadaObjetos.Zgenerics.dominio.Carro;
import javaProgramacaoOrientadaObjetos.Zgenerics.service.BarcoRentavelService;
import javaProgramacaoOrientadaObjetos.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando carro por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}






















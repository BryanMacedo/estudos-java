package javaProgramacaoOrientadaObjetos.Zgenerics.test;

import javaProgramacaoOrientadaObjetos.Zgenerics.dominio.Carro;
import javaProgramacaoOrientadaObjetos.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}






















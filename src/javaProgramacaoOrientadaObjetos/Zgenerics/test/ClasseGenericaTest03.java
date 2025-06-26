package javaProgramacaoOrientadaObjetos.Zgenerics.test;

import javaProgramacaoOrientadaObjetos.Zgenerics.dominio.Barco;
import javaProgramacaoOrientadaObjetos.Zgenerics.dominio.Carro;
import javaProgramacaoOrientadaObjetos.Zgenerics.service.BarcoRentavelService;
import javaProgramacaoOrientadaObjetos.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o Carro por um mês...");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("--------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o Barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}






















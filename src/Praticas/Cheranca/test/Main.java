package Praticas.Cheranca.test;

import Praticas.Cheranca.dominio.Carro;
import Praticas.Cheranca.dominio.Moto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Porsche", "911", 1899, 2);
        Moto moto = new Moto("suzuki", "V-STORM", 2017, 645);

        carro.exibirInformacoes();
        System.out.println("----------------------------");
        moto.exibirInformacoes();

    }
}

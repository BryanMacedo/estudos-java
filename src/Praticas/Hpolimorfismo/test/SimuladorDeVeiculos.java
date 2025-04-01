package Praticas.Hpolimorfismo.test;

import Praticas.Hpolimorfismo.dominio.Caminhao;
import Praticas.Hpolimorfismo.dominio.Carro;
import Praticas.Hpolimorfismo.dominio.Moto;
import Praticas.Hpolimorfismo.dominio.Veiculo;

public class SimuladorDeVeiculos {
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();
        Veiculo v3 = new Caminhao();

        Veiculo[] veiculos = {v1,v2,v3};

        for (Veiculo veiculo : veiculos) {
            System.out.println("Tipo: " + veiculo.getTipo() + " Velocidade máxima: " + veiculo.getVelocidadeMaxima() + " km/h");
        }


    }
}

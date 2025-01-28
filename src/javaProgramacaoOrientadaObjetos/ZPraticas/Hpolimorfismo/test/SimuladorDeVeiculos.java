package javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.test;

import javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.dominio.Caminhao;
import javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.dominio.Carro;
import javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.dominio.Moto;
import javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.dominio.Veiculo;

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

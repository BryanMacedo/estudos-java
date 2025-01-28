package javaProgramacaoOrientadaObjetos.AintroducaoClasses.test;

import javaProgramacaoOrientadaObjetos.AintroducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "BMW";
        carro01.modelo = "SUV";
        carro01.ano = 2013;

        carro02.nome = "Logan";
        carro02.modelo = "sport";
        carro02.ano = 2009;

        carro01 = carro02;

        System.out.println("Nome: " + carro01.nome + " Modelo: " + carro01.modelo + " Ano: " + carro01.ano);
        System.out.println("Nome: " + carro02.nome + " Modelo: " + carro02.modelo + " Ano: " + carro02.ano);



    }
}




















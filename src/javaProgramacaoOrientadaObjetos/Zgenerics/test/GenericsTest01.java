package javaProgramacaoOrientadaObjetos.Zgenerics.test;

import javaProgramacaoOrientadaObjetos.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        //type erasure
        List<String> list = new ArrayList<>();
        list.add("Kirijo");
        list.add("Kirijo");

        for (String o : list) {
            System.out.println(o);
        }
        add(list, new Consumidor("Kirijo"));

        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}













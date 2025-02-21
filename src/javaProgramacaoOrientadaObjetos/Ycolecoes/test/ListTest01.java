package javaProgramacaoOrientadaObjetos.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(16);
        List<String> nomes02 = new ArrayList(16);
        nomes.add("Bryan");
        nomes.add("Simone");
        nomes02.add("Zoro");
        nomes02.add("Robin");

        //System.out.println(nomes.remove("Bryan"));

        nomes.addAll(nomes02);

        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("------------------------");

        int size = nomes.size();
        for (int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);



    }
}













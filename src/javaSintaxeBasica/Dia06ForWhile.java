package javaSintaxeBasica;

import java.util.ArrayList;

public class Dia06ForWhile {
    public static void main(String[] args) {
        String[] nomesArray = new String[10];
        nomesArray[0] = "Bryan";
        nomesArray[1] = "Simone";
        nomesArray[8] = "Sonic";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Bryan");
        nomes.add("Edson");
        nomes.add("Simone");
        nomes.add("Sonic");


        /*for (int i = 0; i < nomesArray.length; i++) {
            System.out.println(nomesArray[i]);
        }*/

        for (String nome : nomesArray) {
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Estou no while");
            contador++;
        }
    }
}




















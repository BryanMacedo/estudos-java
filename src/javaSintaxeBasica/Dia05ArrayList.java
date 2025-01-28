package javaSintaxeBasica;

import java.util.ArrayList;

public class Dia05ArrayList {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 5;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'B';
        String str = "Bryan";
        boolean bool = false;

        String[] nomesArray = new String[10];
        nomesArray[0] = "Bryan";
        nomesArray[1] = "Simone";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Bryan");
        nomes.add("Edson");
        nomes.add("Simone");

        System.out.println("Índice 0: " + nomes.get(0));

        nomes.remove(0);
        nomes.remove("Edson");

        System.out.println("Novo índice 0: " + nomes.get(0));
    }
}















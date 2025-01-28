package javaSintaxeBasica;

public class Dia12ArraysPT2 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        //chat ´\u0000 - espaço em branco
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Jhonny";
        nomes[1] = "Takemura";
        nomes[2] = "Judy";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}

package javaSintaxeBasica;

public class Dia12Arrays {
    public static void main(String[] args) {
        // variaveis de arrys são do tipo reference
        //só tipos referencia podem ser inicializados com nulo;

        int[] idades = new int[3]; // precisa especificar o tamanho
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}

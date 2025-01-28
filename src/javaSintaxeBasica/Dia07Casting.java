package javaSintaxeBasica;

public class Dia07Casting {
    public static void main(String[] args) {
        double resultado = 0.0;

        int resultadoInt = (int) resultado; // casting explicito

        int meuInt = 10;
        double meuDouble = meuInt; // casting implícito

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);
    }
}


























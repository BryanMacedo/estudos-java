package javaSintaxeBasica;

public class Dia11Continue {
    public static void main(String[] args) {
        double valorCarro = 30000;

        for (int i = (int)valorCarro; i >= 1 ; i--) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + i + " R$ " +valorParcela);
        }
    }
}











































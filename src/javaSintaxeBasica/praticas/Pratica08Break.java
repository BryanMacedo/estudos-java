package javaSintaxeBasica.praticas;

public class Pratica08Break {
    public static void main(String[] args) {
        // dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição - valor da parcela >= 1000
        
        double valorCarro = 50000;

        for (int i = 1; i <= valorCarro ; i++) {
           double valorParcela = valorCarro / i;
           if (valorParcela >= 1000){
               System.out.println("Parcela " + i + " R$ " +valorParcela);
           }else {
               break;
           }

            System.out.println("Fora do is-else mas dentro do for");
        }
    }
}

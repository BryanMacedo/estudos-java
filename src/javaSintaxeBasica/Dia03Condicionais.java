package javaSintaxeBasica;

public class Dia03Condicionais {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'B';
        String str = "Bryan";
        boolean bool = false;

        if (str.isBlank()){
            System.out.println("Verdadeiro");
        } else if (str == "Bryan") {
            System.out.println("Bryan");
        }else {
            System.out.println("Falso");
        }
    }
}






















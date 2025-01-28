package javaSintaxeBasica;

public class Dia02TiposPrimitivos {
    public static void main(String[] args) {
        // números inteiros = 100, 2324345, 255, 10
        // byte - short - int - long

        // um byte só ocupa 8 bites na memória. só pode agrupar valores entre:
        //-128 e 127
        byte byteVar = 127;

        //também é um inteiro porem ocupa 16 bites na memória.só pode agrupar valores entre:
        //-32,768 e 32,767
        short shortVar = 32767;

        //também é um inteiro porem ocupa 32 bites na memória.só pode agrupar valores entre:
        // -2.147.483.648 e 2.147.483.647
        int intVar = 2147483647; // mais usado

        //também é um inteiro porem ocupa 64 bites na memória.só pode agrupar valores entre:
        // -9.223.372.836.854.775.808 e 9.223.372.836.854.775.807
        long longVar = 100000L;

        // números decimais = 1.2, 3.4, 5.50 etc
        // float - double

        // ocupa 32 bits na memória
        // precisão simples, pois nos fornece poucos números após a vírgula
        float floarVar = 23.9F;

        // ocupa 64 bits na memória
        // precisão dupla, pois fornece mais números após a vírgula
        double doubleVar = 33.23456;

        // Strings para representar palavras e frases
        // PS: Strings não são tipos primitivos
        String stringVar = "Uma frase qualquer";

        // char representão um unico caractere
        char charVar = 'B';

        // boolean representa os valores boleanos (true e false)
        boolean booleanVar = true;
    }
}



















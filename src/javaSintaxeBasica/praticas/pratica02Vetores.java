package javaSintaxeBasica.praticas;

import java.util.Scanner;

public class pratica02Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Informe o tamanho do vetor: ");

        int vectorSize = sc.nextInt();
        int[] values = new int[vectorSize];

        for (int i = 0; i < vectorSize; i++){
            System.out.print("Digite o valor escolhido: ");
            int value = sc.nextInt();
            values[i] = value;
        }

        System.out.print("Informe qual número quer pesquisar no vetor: ");
        int numberSearched = sc.nextInt();

        for (int i = 0; i < vectorSize; i++) {
            if (values[i] == numberSearched){
                count ++;
            }
        }

        System.out.println("O número " + numberSearched + " apareceu " + count + " vezes");

        sc.close();


        /*Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int vectorSize = sc.nextInt();

        int[] values = new int[vectorSize];

        for(int i = 0; i < vectorSize; i++){
            System.out.print("Digite um valor para colocar no vetor: ");
            int value = sc.nextInt();
            values[i] = value;
        }

        System.out.println("Valores na ordem inversa:");

        for(int i = vectorSize - 1;i >= 0; i--){
            System.out.println(values[i]);
        }

        sc.close();*/


        /*Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.print("Informe o tamanho do Vetor: ");
        int vectorSize = sc.nextInt();

        int[] values = new int[vectorSize];

       for (int i = 0; i < values.length; i++){
           System.out.print("Digite um valor para colocar no vetor: ");
           int value = sc.nextInt();
           values[i] = value;
           soma += values[i];
       }

        System.out.println("A soma dos valores digitados é: " + soma);

        sc.close();*/
    }
}

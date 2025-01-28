package javaSintaxeBasica.praticas;

import java.util.Scanner;

public class Pratica01Condicionais {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = sc.nextInt();

        if (number == 0){
            System.out.println("O número é zero.");
        }else if (number > 0){
            System.out.println("O número é positivo.");
        }else{
            System.out.println("O número é negativo.");
        }

        sc.close();


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int value = sc.nextInt();

        if (value % 2 != 0){
            System.out.println("O número é ímpar.");
        }else {
            System.out.println("O número é par.");
        }

        sc.close();*/


        /*Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("Você é menor de idade.");
        }else{
            System.out.println("Você é maior de idade.");
        }

        sc.close();*/
    }
}
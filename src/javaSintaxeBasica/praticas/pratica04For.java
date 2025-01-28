package javaSintaxeBasica.praticas;

import java.util.Scanner;

public class pratica04For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(+ i + " x " + number + " = " + i*number);
        }

        sc.close();

        /*Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Informe um número inteiro: ");
        int number = sc.nextInt();

        for (int i = 1; i < number ; i++) {
            sum += 1;
        }

        System.out.println("A soma 1 até " + number + " é: " + sum);

        sc.close();*/
    }
}

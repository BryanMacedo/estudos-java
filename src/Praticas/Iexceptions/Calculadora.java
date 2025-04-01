package Praticas.Iexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisao;

        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Digite um número inteiro: ");
                int num01 = sc.nextInt();

                System.out.print("Digite outro número inteiro: ");
                int num02 = sc.nextInt();

                divisao = num01 / num02;

                System.out.println("Resultado: " + divisao);
                valido = true;
            }catch (ArithmeticException e){
                System.out.println("\nNão é possível realizar a divisão de um numero por 0.\n");
            }catch (InputMismatchException e){
                System.out.println("\nEntrada inválida, por favor informe apenas números inteiros.\n");
                sc.nextLine();
            }catch (Exception e){
                System.out.println("\nOcorreu um erro inesperado, por favor informe apenas números inteiros.\n");
            }

        }

    }
}

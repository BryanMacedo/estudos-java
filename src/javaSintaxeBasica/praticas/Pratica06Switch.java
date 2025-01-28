package javaSintaxeBasica.praticas;

import java.util.Scanner;

public class Pratica06Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número entre 1 e 7: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Não é dia útil!");
                break;
            case 2:
                System.out.println("É dia útil!");
                break;
            case 3:
                System.out.println("É dia útil!");
                break;
            case 4:
                System.out.println("É dia útil!");
                break;
            case 5:
                System.out.println("É dia útil!");
                break;
            case 6:
                System.out.println("É dia útil!");
                break;
            case 7:
                System.out.println("Não é dia útil!");
                break;
            default:
                System.out.println("Opção invalida!!");
        }

        sc.close();
    }
}

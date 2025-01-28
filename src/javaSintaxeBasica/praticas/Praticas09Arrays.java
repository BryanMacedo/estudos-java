package javaSintaxeBasica.praticas;

import java.util.Scanner;

public class Praticas09Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um valor para a posição " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }

        System.out.println("\nA soma dos valores digitados são: " + sum);


        sc.close();







        /*int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        for (int i = 9; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }*/
    }
}

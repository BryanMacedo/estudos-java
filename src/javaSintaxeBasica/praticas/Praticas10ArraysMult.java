package javaSintaxeBasica.praticas;

import java.util.Scanner;

public class Praticas10ArraysMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Digite o número de linhas: ");
        int line = sc.nextInt();

        System.out.print("Digite o número de colunas: ");
        int column = sc.nextInt();

        int[][] array = new int[line][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Digite o valor para ["+ i +"] [" + j + "]: ");
                array[i][j] = sc.nextInt();
                sum = sum + array[i][j];
            }
        }

        System.out.print("A soma de todos os elementos da matriz é: " + sum);


        sc.close();
    }
}

package javaSintaxeBasica.praticas;

import java.util.Scanner;

public class pratica05While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean check = true;

        while (check){
            System.out.print("Digite um número para somar: ");
            int number = sc.nextInt();
            if (number == 0){
                System.out.println("A soma dos valores é: " + sum);
                check = false;
            }else {
            sum += number;
            }
        }
        sc.close();
    }
}

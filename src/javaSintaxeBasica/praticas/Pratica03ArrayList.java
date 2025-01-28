package javaSintaxeBasica.praticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pratica03ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Digite 10 números para coloca-lós no arrayList: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            int number = sc.nextInt();
            numbers.add(number);

        }

        Collections.sort(numbers); // estudar collections depois!!!!!

        System.out.println(numbers);

        System.out.print("Digite um número para pesquisar no arrayList: ");
        int numberSearched = sc.nextInt();

        for (int i = 0; i < numbers.size() ; i++) {
            if (numberSearched == numbers.get(i)){
                System.out.println("O número " + numberSearched + " esta presente no arraList na posição " + i);
                check = true;
            }
        }

        if (!check){
            System.out.println("O número " + numberSearched + " não esta presente no arraList!");
        }

        sc.close();


        /*Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        boolean check = false;

        System.out.print("Adicione um nome no arrayList: ");
        String name = sc.nextLine();
        names.add(name);

        for (int i = 1; i != 0 ; i++){
            System.out.print("Deseja adicionar outro nome ao arrayList?[S/N]");
            String choice = sc.nextLine();

            if (choice.equals("S") || choice.equals("s")){
                System.out.print("Adicione um nome no arrayList: ");
                name = sc.nextLine();
                names.add(name);
            } else if (choice.equals("N") || choice.equals("n")) {
                i = -1;
            }else {
                System.out.println("Opção invalida");
                i = -1;
            }
        }

        System.out.println("");
        System.out.println("==============================");
        System.out.println("Nomes que estão no arrayList: ");
        System.out.println("==============================");

        for (int i = 0; i < names.size(); i++){
            System.out.println("nome na posição " + i + ": " + names.get(i));
        }

        System.out.println("");
        System.out.println("=============================================");
        System.out.println("=== REMOVENDO O SEGUNDO NOME DO ARRAYlIST ===");
        System.out.println("=============================================");

        names.remove(1);

        System.out.println("");
        System.out.println("==============================");
        System.out.println("Nomes que estão no arrayList: ");
        System.out.println("==============================");

        for (int i = 0; i < names.size(); i++){
            System.out.println("nome na posição " + i + ": " + names.get(i));
        }

        System.out.println("");
        System.out.println("==============================");
        System.out.println("Atualize o ultimo nome do arrayList: ");
        name = sc.nextLine();
        int arrayListLength = names.size();
        names.remove(arrayListLength - 1);
        names.add(name);

        System.out.println("");
        System.out.println("==============================");
        System.out.println("Nomes que estão no arrayList: ");
        System.out.println("==============================");

        for (int i = 0; i < names.size(); i++){
            System.out.println("nome na posição " + i + ": " + names.get(i));
        }

        System.out.println("");
        int arrayListFinalLength = names.size();
        System.out.println("O arrayList tem: " + arrayListFinalLength + " posições!");

        System.out.println("");
        System.out.print("Verifique se um nome esta no arrayList: ");
        String nameSearched = sc.nextLine();

        for (int i = 0; i < names.size(); i++) {
            if (nameSearched.equals(names.get(i))){
                System.out.println("O nome " + nameSearched + " esta presente no arrayList!");
                check = true;
            }
        }

        if (!check){
            System.out.println("O nome " + nameSearched + " não esta presente no arrayList!");
        }

        sc.close();*/
    }
}

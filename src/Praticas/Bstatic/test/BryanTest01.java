package Praticas.Bstatic.test;

import Praticas.Bstatic.dominio.Bryan;

public class BryanTest01 {
    public static void main(String[] args) {
        Bryan bryan01 = new Bryan();

        Bryan.setAge(23);
        bryan01.imprime();
        Bryan.setAge(24);
        bryan01.imprime();


    }
}

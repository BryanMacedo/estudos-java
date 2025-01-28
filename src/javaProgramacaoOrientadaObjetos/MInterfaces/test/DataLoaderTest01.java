package javaProgramacaoOrientadaObjetos.MInterfaces.test;

import javaProgramacaoOrientadaObjetos.MInterfaces.dominio.DataBaseLoader;
import javaProgramacaoOrientadaObjetos.MInterfaces.dominio.DataLoader;
import javaProgramacaoOrientadaObjetos.MInterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dbl = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dbl.load();
        fileLoader.load();

        System.out.println("+++++++++++++++++++++++++++++++++");

        dbl.remove();
        fileLoader.remove();

        System.out.println("+++++++++++++++++++++++++++++++++");

        dbl.checkPermission();
        fileLoader.checkPermission();

        System.out.println("+++++++++++++++++++++++++++++++++");


        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}























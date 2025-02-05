package javaProgramacaoOrientadaObjetos.Oexceptions.excption.test;

import javaProgramacaoOrientadaObjetos.Oexceptions.excption.dominio.Leitor01;
import javaProgramacaoOrientadaObjetos.Oexceptions.excption.dominio.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) throws IOException {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo02() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
























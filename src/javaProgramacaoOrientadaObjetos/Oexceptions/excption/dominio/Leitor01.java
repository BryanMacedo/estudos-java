package javaProgramacaoOrientadaObjetos.Oexceptions.excption.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor01 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("fechando Leitor01");
    }
}

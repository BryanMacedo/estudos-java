package javaProgramacaoOrientadaObjetos.Oexceptions.Runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            // quando se captura várias exceptions de uma vez a variável 'e' vira final(constante)
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceExceptions();
        } catch (SQLException | IOException e) { // ñ se pode fazer isso com exceções na mesma linha de herança
            e.printStackTrace();
        }
    }

    private static void talvezLanceExceptions() throws SQLException, IOException {
    }
}


















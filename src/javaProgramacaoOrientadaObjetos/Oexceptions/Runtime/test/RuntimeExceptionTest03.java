package javaProgramacaoOrientadaObjetos.Oexceptions.Runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao02();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }
    private static void abreConexao02() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
    }
}

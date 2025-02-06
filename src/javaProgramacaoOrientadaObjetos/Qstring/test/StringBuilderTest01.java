package javaProgramacaoOrientadaObjetos.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Bryan Soares";
        nome.concat(" Macedo");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Bryan Soares");
        sb.append(" Macedo").append(" estudante");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}

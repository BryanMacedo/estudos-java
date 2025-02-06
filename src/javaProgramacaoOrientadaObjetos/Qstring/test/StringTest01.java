package javaProgramacaoOrientadaObjetos.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Bryan"; //String constant pool
        String nome02 = "Bryan";
        nome = nome.concat(" Macedo"); // nome += " Macedo"

        System.out.println(nome);
        System.out.println(nome == nome02);

        String nome03 = new String("Bryan"); // 1 var de ref, 2 obj do tipo str, 3 uma str no pool de str

        System.out.println(nome02 == nome03);
        System.out.println(nome02 == nome03.intern());
    }
}

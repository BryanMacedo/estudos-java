package javaProgramacaoOrientadaObjetos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
//        String texto = "abaaba";
        String texto02 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto02);
        System.out.println("texto:  " + texto02);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}




























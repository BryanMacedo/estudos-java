package javaProgramacaoOrientadaObjetos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // META CARACTERES
        // \d = todos os dígito
        // \D = tudo o q n for dígito
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-zou A-Z, dígitos, _
        // \W = tudo o q n for incluso no \w
        // []
//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
//        String texto = "abaaba";
        String texto02 = "12 0x Ox 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto02);
        System.out.println("texto:  " + texto02);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }

    }
}




























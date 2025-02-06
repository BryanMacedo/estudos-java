package javaProgramacaoOrientadaObjetos.Rdate.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {// date é comum em sistemas legados, não se é usado mais hoje em dia
        Date date = new Date(1738870130384L);// long 100000 ms
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);

    }
}

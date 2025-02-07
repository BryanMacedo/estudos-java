package javaProgramacaoOrientadaObjetos.Rdate.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversaio = LocalDateTime.of(1988, Month.AUGUST, 6, 12,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversaio, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversaio, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversaio, now));
        System.out.println(ChronoUnit.YEARS.between(aniversaio, now));
    }
}
























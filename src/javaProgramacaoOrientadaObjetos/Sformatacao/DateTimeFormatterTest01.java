package javaProgramacaoOrientadaObjetos.Sformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //format -> obj para str
        //parse -> str para obj

        LocalDate date = LocalDate.now();
        String str1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String str2 = date.format(DateTimeFormatter.ISO_DATE);
        String str3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


        LocalDate parse1 = LocalDate.parse("20250208", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-02-08+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-02-08", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String str4 = now.format(DateTimeFormatter.ISO_DATE_TIME);

        LocalDateTime parse4 = LocalDateTime.parse("2025-02-08T10:36:44.3578505");
        System.out.println(parse4);
        //dd/MM/yyyy
        //MM/dd/yyyy
        //yyyy/MM/dd
        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBr);
        System.out.println(formatBR);
        LocalDate parseBr = LocalDate.parse("08/02/2025", formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterGr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGR = LocalDate.now().format(formatterGr);
        System.out.println(formatGR);
        LocalDate parseGr = LocalDate.parse("08.Februar.2025", formatterGr);
        System.out.println(parseGr);


    }
}


















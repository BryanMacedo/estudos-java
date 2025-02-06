package javaProgramacaoOrientadaObjetos.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormetTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nba = new NumberFormat[4];

        nba[0] = NumberFormat.getInstance();
        nba[1] = NumberFormat.getInstance(localeJP);
        nba[2] = NumberFormat.getInstance(localeBR);
        nba[3] = NumberFormat.getInstance(localeIT);

        double valor = 1_000.2130;
        for (NumberFormat numberFormat : nba) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMinimumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";
        try {
            System.out.println(nba[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}






















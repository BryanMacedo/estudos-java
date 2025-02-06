package javaProgramacaoOrientadaObjetos.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormetTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nba = new NumberFormat[4];

        nba[0] = NumberFormat.getCurrencyInstance();
        nba[1] = NumberFormat.getCurrencyInstance(localeJP);
        nba[2] = NumberFormat.getCurrencyInstance(localeBR);
        nba[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1000.2130;
        for (NumberFormat numberFormat : nba) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "￥1,000";
        try {
            System.out.println(nba[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}





















